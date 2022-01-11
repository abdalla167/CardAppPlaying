package com.example.cardappplaying.model.startgypatterncard.inhertfrominterface.curenntCondation

import com.example.CardApp.model.startgypatterncard.interfaceses.CondtionCurrentCard

class OnSpace : CondtionCurrentCard {
    // if player take card from ground and he only can see it
    override fun typeCard(): Int {
        return 5
    }
}