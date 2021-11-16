package com.example.proayimapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity0811212: AppCompatActivity(),OnClickListener {
//    private lateinit var

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main0811213)
    }
    override fun onClicked(text: String){
        // text 'aaa'
        val fragment2 = supportFragmentManager.findFragmentById(R.id.act2_cont2) as? fragment2
        fragment2?.setValue(text)
    }
}