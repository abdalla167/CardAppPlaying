package com.example.CardApp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.cardappplaying.R
import com.example.cardappplaying.other.SharedPrefrance
import com.example.cardappplaying.ui.MainActivity
import kotlinx.coroutines.*

class SplashScreen : AppCompatActivity() {
    val activityScope = CoroutineScope(Dispatchers.Main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        var sh= SharedPrefrance(this)

        activityScope.launch {
                sh.clearData()
            delay(3000)

            val intent = Intent(this@SplashScreen, MainActivity::class.java)
                startActivity(intent)
                finish()

            }
        }

        override fun onPause() {
            activityScope.cancel()
            super.onPause()
        }

    }

