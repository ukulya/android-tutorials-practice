package com.example.proayimapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContentView(R.layout.activity_main)*/
        /*setContentView(R.layout.activity_linear)*/
        /*setContentView(R.layout.activity_relative)*/
        /*setContentView(R.layout.activity_constraint)*/
        /*setContentView(R.layout.activity_homework)*/
        setContentView(R.layout.activity_horizontal_homework)

        val textView = findViewById<TextView>(R.id.text)
        val editText= findViewById<TextView>(R.id.edit)
        val btn = findViewById<TextView>(R.id.button1)

        btn.setOnClickListener{
            textView.text
        }

    }
}