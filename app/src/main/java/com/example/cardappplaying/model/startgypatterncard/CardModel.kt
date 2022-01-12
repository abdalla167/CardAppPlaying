package com.example.CardApp.model.startgypatterncard

import com.example.cardappplaying.R
import java.io.Serializable

data class CardModel(var condationAbality: Int,
                     var condtionCurrentCard: Int,
                     var icanSee:Boolean,
                     var cardname:String,
                     var cardvalue:Int,
                     var imageCard:Int
) : Serializable  {

constructor():this(0,0,false,"",0, R.drawable.background)

 }