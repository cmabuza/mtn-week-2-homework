package com.example.itsgotime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        getSupportActionBar()?.hide();

        fun openMainActivity(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        Timer("SettingUp", false).schedule(3000) {
            openMainActivity()
        }
    }
}