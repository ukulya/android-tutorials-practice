package com.example.proayimapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2710211 : AppCompatActivity() {
    /* этот файл мы создали как обычный котлин файл */
    /*<!--когда вручную создаем mainActivity - то нужно добавть в файл манифест-->*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2710211)
    }
    override fun onResume() { // интерактив
        super.onResume()
        Log.e("TAG","Berg: onResume")
    }

    override fun onPause() { // activity unFocus
        super.onPause()
        Log.e("TAG","Berg: onPause")
    }

    override fun onStart() {
        super.onStart()
        Log.e("TAG","Berg: onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.e("TAG","Berg: onStop")
    }

    override fun onDestroy() { // activity destroyed
        super.onDestroy()
        Log.e("TAG","Berg: onDestroy")
    }

    companion object{
        private const val TAG = "MainActivity"
    }
}