package com.example.cardappplaying.reposatry

import android.util.Log
import com.example.CardApp.model.Person
import com.example.CardApp.model.Room
import com.example.CardApp.model.startgypatterncard.CardModel
import com.example.cardappplaying.other.CreatingCardes
import com.example.cardappplaying.other.Resource
import com.example.cardappplaying.other.safeCall
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.OnSuccessListener
import com.google.firebase.database.*
import com.google.firebase.database.ktx.getValue
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext
import java.util.*
import kotlin.collections.ArrayList

class RepCreatingRoom {



    suspend fun addNewPlayer(idRoom: String, person: Person): Resource<String> {
        var databaseReference = FirebaseDatabase.getInstance().getReference("room")

        return withContext(Dispatchers.IO) {
            safeCall {
                val key = databaseReference.push().key.toString()
                databaseReference
                    .child(idRoom)
                    .child("players").child(key)
                    .setValue(person).await()
                Resource.Success(key)
            }
        }
    }
    //delet four card
    suspend fun deletFourCardFromDatabase(idRoom: String): Resource<ArrayList<CardModel>> {
        val listCardModel=ArrayList<CardModel>()
        return withContext(Dispatchers.IO) {
safeCall {
    var databaseReference = FirebaseDatabase.getInstance().getReference("room").child(idRoom)
        .child("cardingroundclosed")

      databaseReference.get().addOnCompleteListener(OnCompleteListener { result->
                var i = 1
               // Log.d("TAG", "deletFourCardFromDatabase: "+it.childrenCount)
                for (data in result.result?.children!!) {
                    if (i <= 4) {
                        i++
                        data.getValue<CardModel>()?.let {
                            if(i<=3)
                            {
                                it.condtionCurrentCard=2
                                it.icanSee=true
                                it.condationAbality=0
                                listCardModel.add(it)
                            }
                            else
                                listCardModel.add(it)
                            }
                        data.ref.removeValue()
                    }
                    if (i > 4) {
                        break
                    }

                }


    }).await()
    //databaseReference.onDisconnect()
    Resource.Success(listCardModel)

}



        }

    }


    suspend fun creatNewRoom(room: Room): Resource<String> {
        return withContext(Dispatchers.IO) {
            var databaseReference = FirebaseDatabase.getInstance().getReference("room")

            safeCall {
                val key = databaseReference.push().key.toString()
                //Log.d("TAG", "creatNewRoom: "+ newKey)
                databaseReference.child(key).setValue(room).await()
                Resource.Success(key)
            }
        }

    }


}