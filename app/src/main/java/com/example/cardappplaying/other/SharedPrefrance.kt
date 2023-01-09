package com.example.cardappplaying.other

import android.content.Context
import android.content.SharedPreferences
import com.example.cardappplaying.other.Constant.Companion.SHARD_PERFRANCE
import com.example.cardappplaying.ui.fragment.creatroomfragment.ScaneQRCodeFragment

class SharedPrefrance(context: Context) {



        val sharedPreferences: SharedPreferences =
            context.getSharedPreferences(SHARD_PERFRANCE, Context.MODE_PRIVATE)

        fun saveIDRoomCurrent(id: String) {
            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("room_key", id)
            editor.apply()
            editor.commit()
        }

        fun saveIDPlayerCurrent(id: String) {
            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("player_key", id)
            editor.apply()
            editor.commit()
        }
    fun saveNamePlayer(name:String)
    {
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putString("player_name", name)
        editor.apply()
        editor.commit()
    }

    fun getNamePlayer():String
    {
        return sharedPreferences.getString("player_name","")!!
    }

    fun getIDPlayer():String
    {
       return sharedPreferences.getString("player_key","")!!
    }
    fun getIDRoom():String
    {
        return sharedPreferences.getString("room_key","")!!

    }

        fun clearData() {
            val editor = sharedPreferences.edit()
            editor.clear()
            editor.apply()
        }
    }

