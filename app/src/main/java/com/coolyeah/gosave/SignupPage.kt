package com.coolyeah.gosave

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.coolyeah.gosave.R
import com.coolyeah.gosave.ui.Onboarding_4

class SignupPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_page)


        val loginDisini = findViewById<TextView>(R.id.login_disini) //
        loginDisini.setOnClickListener {
            val intent = Intent(this, SigninPage::class.java)
            startActivity(intent)
        }
    }
}