package com.example.itsgotime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Btn1: Button = findViewById(R.id.btn1)
        val Btn2: Button = findViewById(R.id.btn2)

        Btn1.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        Btn2.setOnClickListener{
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}