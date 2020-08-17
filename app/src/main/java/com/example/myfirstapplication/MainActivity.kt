package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.notification.StatusBarNotification
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loginButton = findViewById<ImageButton>(R.id.loginButton)

        loginButton.setOnClickListener {
            Toast.makeText(this,"Successfully logged in :) ",Toast.LENGTH_LONG).show()
            openAccount()
        }
    }
    fun openAccount(){
        val intent = Intent(this,AccountScreen::class.java)
        startActivity(intent)
    }
}