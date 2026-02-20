package com.octapus.vibrafit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WelcomeScreenActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen1)

        val startButton = findViewById<Button>(R.id.startButton)
        val barritaButton = findViewById<Button>(R.id.barritaButton) // Aquí la barrita

        startButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        barritaButton.setOnClickListener {
            val intent = Intent(this, splash_screen_2::class.java)
            startActivity(intent)
            // No finalizamos welcomeScreen para poder volver si quieres
        }
    }
}

