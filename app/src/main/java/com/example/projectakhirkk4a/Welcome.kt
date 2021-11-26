package com.example.projectakhirkk4a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val intentButton : Button = findViewById(R.id.button)
        intentButton.setOnClickListener{viewWelcome()}
    }

    private fun viewWelcome() {
        val intent = Intent (this, Login::class.java)
        startActivity(intent)
    }
}