package com.example.CardApp.model.startgypatterncard

import java.io.Serializable

data class CardModel(var condationAbality: Int,
                     var condtionCurrentCard: Int,
                     var icanSee:Boolean,
                     var cardname:String
) : Serializable  {

constructor():this(0,0,false,"")

 }