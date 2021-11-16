package com.example.proayimapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity11121 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main11121)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, Fragment())
            .commit()
    }
}