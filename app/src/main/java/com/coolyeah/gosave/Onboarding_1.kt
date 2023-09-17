package com.coolyeah.gosave.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.coolyeah.gosave.Onboarding_2
import com.coolyeah.gosave.R

class Onboarding_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_1)

        val nextButton = findViewById<Button>(R.id.button) //
        nextButton.setOnClickListener {
            val intent = Intent(this, Onboarding_2::class.java)
            startActivity(intent)
        }

        val skipButton = findViewById<Button>(R.id.button2) //
        skipButton.setOnClickListener {
            val intent = Intent(this, Onboarding_4::class.java)
            startActivity(intent)
        }
    }
}