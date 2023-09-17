package com.coolyeah.gosave

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.coolyeah.gosave.ui.Onboarding_3
import com.coolyeah.gosave.ui.Onboarding_4

class  Onboarding_2 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_2)

        val nextButton = findViewById<Button>(R.id.button) //
        nextButton.setOnClickListener {
            val intent = Intent(this, Onboarding_3::class.java)
            startActivity(intent)
        }

        val skipButton = findViewById<Button>(R.id.button2) //
        skipButton.setOnClickListener {
            val intent = Intent(this, Onboarding_4::class.java)
            startActivity(intent)
        }
    }
}