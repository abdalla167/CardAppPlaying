package com.example.cardappplaying.other

import com.example.CardApp.model.Person
import com.example.CardApp.model.Room
import com.example.CardApp.model.startgypatterncard.CardModel
import com.example.CardApp.model.startgypatterncard.inhertfrominterface.abality.ExchangeMyCardWithMyFrind
import com.example.CardApp.model.startgypatterncard.inhertfrominterface.abality.NoAbalibalty
import com.example.CardApp.model.startgypatterncard.inhertfrominterface.abality.SeeFrindCard
import com.example.CardApp.model.startgypatterncard.inhertfrominterface.abality.SeeMyCard
import com.example.CardApp.model.startgypatterncard.inhertfrominterface.curenntCondation.InGroundClosed
import com.example.CardApp.model.startgypatterncard.inhertfrominterface.iCanSee.IcanNotsee
import com.example.cardappplaying.R
import java.util.*
import kotlin.collections.ArrayList

class CreatingCardes {
    companion object {
        fun creatListOfCard(): Stack<CardModel> {

           var  condationAbality = NoAbalibalty().abality()
           var  condtionCurrentCard = InGroundClosed().typeCard()
           var  icanSee = IcanNotsee() .canISee()

            var listofcard= listOf(
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "1.1",
                    1,
                ""+R.drawable.onecarreau
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "1.2",
                    1,
                    ""+ R.drawable.oneheart

                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "1.3",
                    1,
                    ""+R.drawable.onepique
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "1.4",
                    1,
                    ""+R.drawable.oneclub
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "2.1",
                    2,
                    ""+ R.drawable.twocarreau

                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "2.2",
                    2,
                    ""+R.drawable.twoheart
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "2.3",
                    2,
                    ""+R.drawable.twoclube
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "2.4",
                    2,
                    ""+R.drawable.twopique
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "3.1",
                    3,
                    ""+ R.drawable.threecarreau
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "3.2",
                    3,
                    ""+R.drawable.threeclube
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "3.3",
                    3,
                    ""+R.drawable.threeheart
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "3.4",
                    3,
                    ""+R.drawable.threepique
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "4.1",
                    4,
                    ""+R.drawable.fourcarreau
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "4.2",
                    4,
                    ""+R.drawable.fourclube
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "4.3",
                    4,
                    ""+R.drawable.fourheart
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "4.4",
                    4,
                    ""+R.drawable.fourpique
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "5.1",
                    5,
                    ""+R.drawable.fivecarreau
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "5.2",
                    5,
                    ""+R.drawable.fiveclube
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "5.3",
                    5,
                    ""+R.drawable.fiveheart
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "5.4",
                    5,
                    ""+R.drawable.fivepique
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "6.1",
                    6,
                    ""+R.drawable.sixcarreau
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "6.2",
                    6,
                    ""+R.drawable.sixclube
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "6.3",
                    6,
                    ""+R.drawable.sixheart
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "6.4",
                    6,
                    ""+R.drawable.sixpique
                ),
                CardModel(
                    condationAbality = SeeMyCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "7.1",
                    7,
                    ""+R.drawable.sevencarreau
                ),
                CardModel(
                    condationAbality = SeeMyCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "7.2",
                    7,
                    ""+R.drawable.sevenclube
                ),
                CardModel(
                    condationAbality = SeeMyCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "7.3",
                    7,
                    ""+R.drawable.sevenheart
                ),
                CardModel(
                    condationAbality = SeeMyCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "7.4",
                    7,
                    ""+R.drawable.sevenpique
                ),
                CardModel(
                    condationAbality = SeeMyCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "8.1",
                    8,
                    ""+R.drawable.eightcarreau
                ),
                CardModel(
                    condationAbality = SeeMyCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "8.2",
                    8,
                    ""+R.drawable.eightclube
                ),
                CardModel(
                    condationAbality = SeeMyCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "8.3",
                    8,
                    ""+R.drawable.eightheart
                ),
                CardModel(
                    condationAbality = SeeMyCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "8.4",
                    8,
                    ""+R.drawable.eightpique
                ),
                CardModel(
                    condationAbality = SeeFrindCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "9.1",
                    9,
                    ""+R.drawable.ninecarreau
                ),
                CardModel(
                    condationAbality = SeeFrindCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "9.2",
                    9,
                    ""+R.drawable.nineclube
                ),
                CardModel(
                    condationAbality = SeeFrindCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "9.3",
                    9,
                    ""+R.drawable.nineheart
                ),
                CardModel(
                    condationAbality = SeeFrindCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "9.4",
                    9,
                    ""+R.drawable.ninepique
                ),
                CardModel(
                    condationAbality = SeeFrindCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "10.1",
                    10,
                    ""+R.drawable.tencarreau
                ),
                CardModel(
                    condationAbality = SeeFrindCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "10.2",
                    10,
                    ""+R.drawable.tenclube
                ),
                CardModel(
                    condationAbality = SeeFrindCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "10.3",
                    10,
                    ""+R.drawable.tenheart
                ),
                CardModel(
                    condationAbality = SeeFrindCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "10.4",
                    10,
                    ""+R.drawable.tenpique
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "11.1",
                    11,
                    ""+R.drawable.queencarreau
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "11.2",
                    11,
                    ""+R.drawable.queenclube
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "11.3",
                    11,
                    ""+R.drawable.queenheart
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "11.4",
                    11,
                    ""+R.drawable.queenpique
                ),
                CardModel(
                    condationAbality = ExchangeMyCardWithMyFrind().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "12.1",
                    12,
                    ""+R.drawable.boycarreau
                ),
                CardModel(
                    condationAbality = ExchangeMyCardWithMyFrind().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "12.2",
                    12,
                    ""+R.drawable.boyclube
                ),
                CardModel(
                    condationAbality = ExchangeMyCardWithMyFrind().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "12.3",
                    12,
                    ""+R.drawable.boyheart
                ),
                CardModel(
                    condationAbality = ExchangeMyCardWithMyFrind().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "12.4",
                    12,
                    ""+R.drawable.boypique
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "13.1",
                    0,
                    ""+R.drawable.kingcarreau
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "13.2",
                    0,
                    ""+R.drawable.kingheart
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "13.3",
                    13,
                    ""+R.drawable.kingclube
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "13.4",
                    13,
                    ""+R.drawable.kingpique
                )

            ).shuffled()
            var stack = Stack<CardModel>()
            stack.addAll(listofcard)

            return stack


        }
        fun creatingRoom( highScour:Int):Room
        {
            var players = ArrayList<Person>()
             var stack= creatListOfCard()
             //list of players
             var temp2=  ArrayList<CardModel>()
             temp2.addAll(stack)
             var temp3=ArrayList<CardModel>()
             temp3.clear()
             var tempplayer=ArrayList<Person>()
             tempplayer.clear()
             return Room(tempplayer,highScour, temp2, temp3)

        }
    }

}
