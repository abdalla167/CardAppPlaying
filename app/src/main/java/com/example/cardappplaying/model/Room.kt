package com.example.CardApp.model

import com.example.CardApp.model.startgypatterncard.CardModel
import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class Room (var players:ArrayList<Person>,
                 var highScour:Int?=0,
                 var cardingroundclosed:ArrayList<CardModel>,
                 var cardingroundopen:ArrayList<CardModel>
                 ):Serializable
{


}