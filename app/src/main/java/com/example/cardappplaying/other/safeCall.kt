package com.example.cardappplaying.other

import android.util.Log
import com.google.android.gms.tasks.Task
import com.google.firebase.database.DataSnapshot

inline fun <T> safeCall(action: () -> Resource<T>): Resource<T> {
    return try {
        action()
    } catch (e: Exception) {
        Log.d("TAG", "safeCall: "+e.message)
        Resource.Error(e.message ?: "An unknown Error Occurred")

    }
}