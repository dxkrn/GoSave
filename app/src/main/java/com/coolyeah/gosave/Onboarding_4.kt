package com.coolyeah.gosave.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.coolyeah.gosave.Onboarding_2
import com.coolyeah.gosave.R
import com.coolyeah.gosave.SigninPage
import com.coolyeah.gosave.SignupPage

class Onboarding_4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_4)

        val loginButton = findViewById<Button>(R.id.button) //
        loginButton.setOnClickListener {
            val intent = Intent(this, SigninPage::class.java)
            startActivity(intent)
        }

        val registButton = findViewById<Button>(R.id.button2) //
        registButton.setOnClickListener {
            val intent = Intent(this, SignupPage::class.java)
            startActivity(intent)
        }
    }
}