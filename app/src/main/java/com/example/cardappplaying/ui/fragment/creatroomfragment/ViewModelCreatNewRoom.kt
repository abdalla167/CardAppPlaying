package com.example.cardappplaying.ui.fragment.creatroomfragment

import android.media.AsyncPlayer
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.CardApp.model.Person
import com.example.CardApp.model.Room
import com.example.CardApp.model.startgypatterncard.CardModel
import com.example.cardappplaying.other.Resource
import com.example.cardappplaying.reposatry.RepCreatingRoom
import com.google.firebase.database.DatabaseReference
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ViewModelCreatNewRoom : ViewModel() {
    private val _CreatingRoom = MutableLiveData<Resource<String>>()
    val CreatingRoom: LiveData<Resource<String>> = _CreatingRoom

    private val _AddNewPlayer=MutableLiveData<Resource<String>>()
    val AddnewPlayer:LiveData<Resource<String>> = _AddNewPlayer

    private val repCreateNewRoom = RepCreatingRoom()
    companion object
    {
        var idPlayerNotChange:String=""
    }

    fun AddnewPlayerToFirebase(idRoom:String,nameplayer:String)
    {
        var error=
            if(idRoom==null)
            {
                "Somthing Wroing"

            }else null

        error?.let{
            _AddNewPlayer.postValue(Resource.Error(it))
            return
        }
        _AddNewPlayer.postValue((Resource.Loading()))
        viewModelScope.launch (Dispatchers.IO)
        {
            val listofcard=repCreateNewRoom.deletFourCardFromDatabase(idRoom)
            val person= listofcard.data?.let { Person(nameplayer,false,0, it) }
            val addnewplayer= person?.let { repCreateNewRoom.addNewPlayer(idRoom, it) }
            _AddNewPlayer.postValue(addnewplayer)
            idPlayerNotChange = addnewplayer?.data.toString()

        }
    }



    fun creatNewRoom(room: Room) {
        var error =
            if (room == null) {
                "Emptiy Hight Scoure"
            } else null

        error?.let {
            _CreatingRoom.postValue(Resource.Error(it))
            return
        }
        _CreatingRoom.postValue(Resource.Loading())
        viewModelScope.launch(Dispatchers.Main) {
            val creatroom = repCreateNewRoom.creatNewRoom(room)
            _CreatingRoom.postValue(creatroom)
        }


    }

}