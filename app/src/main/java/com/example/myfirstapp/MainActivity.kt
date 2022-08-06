package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val tvMyTextView = findViewById<TextView>(R.id.textView)
        var timeClicks = 0

        btnClickMe.setOnClickListener{
            timeClicks++
            //btnClickMe.text = "HAHA you clicked me"
            tvMyTextView.text = timeClicks.toString()
            Toast.makeText(this,"Hey you there",Toast.LENGTH_LONG).show()
        }
    }
}