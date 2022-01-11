package com.example.CardApp.model.startgypatterncard.inhertfrominterface.iCanSee

import com.example.CardApp.model.startgypatterncard.interfaceses.IcanSee

class IcanNotsee :IcanSee {
    override fun canISee(): Boolean {
        return false
    }
}