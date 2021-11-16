package com.example.proayimapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton

class MainActivity271021 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main271021)
        Log.e("TAG","Berg: onCreate")

        var btn = findViewById<AppCompatButton>(R.id.btnGoTo2)
        btn.setOnClickListener{
            val intent = Intent(this,MainActivity271021:: class.java)
            startActivity(intent)
        }

        /* intent - при перехде из одного активити в другой */
        /*Intent()*/
        /* есть класс Context - достать строки,цвета т.д*/
        /* this - ссылка на текущий объект */
        /* контекст приложения отличается от контекста активитти*/
    }

    override fun onResume() { // интерактив
        super.onResume()
    }

    override fun onPause() { // activity unFocus
        super.onPause()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() { // activity destroyed
        super.onDestroy()
    }


}