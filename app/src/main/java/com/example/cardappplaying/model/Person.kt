package com.example.CardApp.model

import com.example.CardApp.model.startgypatterncard.CardModel
import java.io.Serializable

data class Person(
    var name:String,
    var itIsHisTurn:Boolean=false,
    var total:Int,
    var card: ArrayList<CardModel>
): Serializable {

}