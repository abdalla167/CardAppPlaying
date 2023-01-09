package com.example.cardappplaying.other

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class UIModePreference(context: Context) {
//    //1
//    private val dataStore: DataStore<Preferences> = context.createDataStore(
//        name = "ui_mode_preference"
//    )
//    //2
//    suspend fun saveToDataStore(isNightMode: Boolean) {
//        dataStore.edit { preferences ->
//            preferences[UI_MODE_KEY] = isNightMode
//        }
//    }
//    //3
//    val uiMode: Flow<Boolean> = dataStore.data
//        .map { preferences ->
//            val uiMode = preferences[UI_MODE_KEY] ?: false
//            uiMode
//        }
//    //4
//    companion object {
//        private val UI_MODE_KEY = preferencesKey<Boolean>("ui_mode")
//    }

}