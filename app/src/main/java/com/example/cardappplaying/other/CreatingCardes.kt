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
                    1
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "1.2",
                    1

                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "1.3",
                    1
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "1.4",
                    1
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "2.1",
                    2

                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "2.2",
                    2
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "2.3",
                    2
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "2.4",
                    2
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "3.1",
                    3
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "3.2",
                    3
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "3.3",
                    3
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "3.4",
                    3
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "4.1",
                    4
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "4.2",
                    4
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "4.3",
                    4
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "4.4",
                    4
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "5.1",
                    5
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "5.2",
                    5
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "5.3",
                    5
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "5.4",
                    5
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "6.1",
                    6
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "6.2",
                    6
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "6.3",
                    6
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "6.4",
                    6
                ),
                CardModel(
                    condationAbality = SeeMyCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "7.1",
                    7
                ),
                CardModel(
                    condationAbality = SeeMyCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "7.2",
                    7
                ),
                CardModel(
                    condationAbality = SeeMyCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "7.3",
                    7
                ),
                CardModel(
                    condationAbality = SeeMyCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "7.4",
                    7
                ),
                CardModel(
                    condationAbality = SeeMyCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "8.1",
                    8
                ),
                CardModel(
                    condationAbality = SeeMyCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "8.2",
                    8
                ),
                CardModel(
                    condationAbality = SeeMyCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "8.3",
                    8
                ),
                CardModel(
                    condationAbality = SeeMyCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "8.4",
                    8
                ),
                CardModel(
                    condationAbality = SeeFrindCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "9.1",
                    9
                ),
                CardModel(
                    condationAbality = SeeFrindCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "9.2",
                    9
                ),
                CardModel(
                    condationAbality = SeeFrindCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "9.3",
                    9
                ),
                CardModel(
                    condationAbality = SeeFrindCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "9.4",
                    9
                ),
                CardModel(
                    condationAbality = SeeFrindCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "10.1",
                    10
                ),
                CardModel(
                    condationAbality = SeeFrindCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "10.2",
                    10
                ),
                CardModel(
                    condationAbality = SeeFrindCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "10.3",
                    10
                ),
                CardModel(
                    condationAbality = SeeFrindCard().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "10.4",
                    10
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "11.1",
                    11
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "11.2",
                    11
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "11.3",
                    11
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "11.4",
                    11
                ),
                CardModel(
                    condationAbality = ExchangeMyCardWithMyFrind().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "12.1",
                    12
                ),
                CardModel(
                    condationAbality = ExchangeMyCardWithMyFrind().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "12.2",
                    12
                ),
                CardModel(
                    condationAbality = ExchangeMyCardWithMyFrind().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "12.3",
                    12
                ),
                CardModel(
                    condationAbality = ExchangeMyCardWithMyFrind().abality(),
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "12.4",
                    12
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "13.1",
                    0
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "13.2",
                    0
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "13.3",
                    13
                ),
                CardModel(
                    condationAbality = condationAbality,
                    condtionCurrentCard = condtionCurrentCard,
                    icanSee = icanSee,
                    "13.4",
                    13
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
