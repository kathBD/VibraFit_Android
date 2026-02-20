package com.octapus.vibrafit

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity

class activity_splash_screeen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screeen)

        seeWelcome()
    }

    private fun seeWelcome() {
        object : CountDownTimer(3000, 1000) {
            override fun onTick(p0: Long) {
                // puedes mostrar animación aquí
            }

            override fun onFinish() {
                val intent = Intent(this@activity_splash_screeen, WelcomeScreenActivity1::class.java)
                startActivity(intent)
                finish()
            }
        }.start()
    }
}


