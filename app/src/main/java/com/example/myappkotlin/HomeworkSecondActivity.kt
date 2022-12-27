package com.example.myappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeworkSecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework_second)
        val textFromMainActivity = intent.getStringExtra("GREETINGS")
        val textView = findViewById<TextView>(R.id.textViewHomework)
        textView.text = textFromMainActivity
    }
}