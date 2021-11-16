package com.example.proayimapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import layout.Fragment051121

class MainActivity051121 : AppCompatActivity(),onButtonClicked {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main051121)

        val edit = findViewById<AppCompatEditText>(R.id.edit_view)
        val btn = findViewById<AppCompatButton>(R.id.btn)
        /*btn.setOnClickListener{
            *//*startActivity(Intent(this,MainActivity0511212:: class.java))*//*
            val fragment1 = supportFragmentManager.findFragmentById(R.id.fragment) as? Fragment051121
            fragment1?.setText(edit.text.toString())
        }*/
        btn.setOnClickListener{
            Intent(this,MainActivity0511212::class.java)
            startActivity(Intent)
        }
    }

    override fun onButtonClicked(){

    }

    private fun initFragment(){
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment,Fragment051121())
            .commit()
    }
}