package com.example.cardappplaying.ui.fragment.playingRoomFragment

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.CardApp.model.Person
import com.example.cardappplaying.other.Resource
import com.example.cardappplaying.other.safeCall
import com.example.cardappplaying.reposatry.ReposatryInGame
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ViewModelInCame() : ViewModel() {
    private val _GetAllPlayer = MutableLiveData<Resource<ArrayList<Person>>>()
    val GetAllPlayer: LiveData<Resource<ArrayList<Person>>> = _GetAllPlayer


    private val _GetPlayer = MutableLiveData<Person>()
    val GetPlayer: LiveData<Person> = _GetPlayer

    private val _CurrentPlayer = MutableLiveData<Resource<Person>>()
    val player: LiveData<Resource<Person>> = _CurrentPlayer


    private val reposatryInGame = ReposatryInGame()
    fun getPlayers(idRoom: String, idPlayer: String) {
        var error =
            if (idRoom == null) {
                "Somthing Wroing"

            } else null

        error?.let {
            _GetAllPlayer.postValue(Resource.Error(it))
            return
        }

        _GetAllPlayer.postValue(Resource.Loading())
        viewModelScope.launch {
            var (listOfPlayer, player1) = reposatryInGame.getAllPlayer(idRoom, idPlayer)
            _GetAllPlayer.postValue(listOfPlayer)
            _CurrentPlayer.postValue(player1)
        }

    }

    suspend fun getPlayerChange(idRoom: String) {
        var databaseReference = FirebaseDatabase.getInstance().getReference("room")

        var person = Person()
        var resultPlayer: List<Person>
        resultPlayer = emptyList()
        withContext(Dispatchers.Main)
        {

            databaseReference.child(idRoom).child("players").addValueEventListener(object :
                ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    if (dataSnapshot.exists() && dataSnapshot.hasChildren()) {
                        resultPlayer =
                            dataSnapshot.children.map { it.getValue(Person::class.java)!! }
                        if (!resultPlayer.isEmpty()) {
                            person = resultPlayer.get(resultPlayer.size - 1)
                            _GetPlayer.postValue(person)
                            Log.d("TAG", "onDataChange: " + resultPlayer)
                        }

                    }
                }

                override fun onCancelled(error: DatabaseError) {
                }

            })


        }


    }


}



