package com.example.projectakhirkk4a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val intentButton : Button = findViewById(R.id.button2)
        intentButton.setOnClickListener{viewDashboard()}
    }

    private fun viewDashboard() {
        val intent = Intent (this, MainActivity::class.java)
        startActivity(intent)
    }
}