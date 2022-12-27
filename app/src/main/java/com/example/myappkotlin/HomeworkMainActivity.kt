package com.example.myappkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeworkMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework_main)
    }

    override fun onStop() {
        super.onStop()
        val randomIntent = Intent(this,HomeworkSecondActivity::class.java)
        randomIntent.putExtra("GREETINGS", "Hi from MainActivity")
        startActivity(randomIntent)
    }
}