package com.example.cardappplaying.reposatry

import android.content.Context
import android.util.Log
import com.example.CardApp.model.Person
import com.example.CardApp.model.startgypatterncard.CardModel
import com.example.cardappplaying.other.Resource
import com.example.cardappplaying.other.SharedPrefrance
import com.example.cardappplaying.other.safeCall
import com.example.cardappplaying.ui.fragment.playingRoomFragment.ViewModelInCame
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.database.*
import com.google.firebase.database.ktx.getValue
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext
import kotlin.math.log

class ReposatryInGame() {
    var databaseReference = FirebaseDatabase.getInstance().getReference("room")


    //get players
    suspend fun getAllPlayer(
        idRoom: String,
        idPlayer: String
    ): Pair<Resource<ArrayList<Person>>, Resource<Person>> {
        var person = Person()
        var resultAllPlayer: List<Person>
        var resultPlayerWithoutme: List<Person>
        resultAllPlayer = emptyList()
        resultPlayerWithoutme = emptyList()
        return withContext(Dispatchers.IO)
        {
            try {
                resultAllPlayer = databaseReference.child(idRoom).child("players")
                    .get().await().children.map { dataSnapshot ->
                        dataSnapshot.getValue(Person::class.java)!!
                    }

                resultPlayerWithoutme = resultAllPlayer.filterNot { li ->
                    li.id == idPlayer
                }
                Log.d("TAG", "getAllPlayer: " + resultAllPlayer)

                person = resultAllPlayer.filter { li ->
                    li.id.equals(idPlayer)
                }.single()

            } catch (exception: Exception) {

            }

            Pair(
                Resource.Success(resultPlayerWithoutme as ArrayList<Person>),
                Resource.Success(person)
            )

        }

    }

    suspend fun getCurrentPlayer(listPlayers: ArrayList<Person>, idPlayer: String): Resource<Int> {
        var posation: Int
        posation = 0
        return withContext(Dispatchers.IO)
        {


            safeCall {
                for (per in listPlayers) {
                    if (idPlayer == per.id) {
                        break

                    }
                    posation++
                }

                Resource.Success(posation)
            }
        }

    }

}