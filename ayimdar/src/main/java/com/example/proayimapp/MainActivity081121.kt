package com.example.proayimapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import layout.Fragment051121

class MainActivity081121 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main081121)

        initFragment()

        layout = findViewById(R.id.container)
        text1 = findViewById(R.id.text1)

        val btn1 = findViewById<AppCompatButton>(R.id.btn1)
        btn1.setOnClickListener{
            /*supportFragmentManager.beginTransaction()
                .replace(R.id.container, Fragment051121())
                .addToBackStack(null)
                .commit()*/
            val fragment1 = supportFragmentManager.findFragmentByTag("fragment1")
            val fragment2 = supportFragmentManager.findFragmentByTag("fragment2")
            supportFragmentManager.beginTransaction()
                .show(fragment1!!)
                .hide(fragment2!!)
                .commit()

        }
        val btn2 = findViewById<AppCompatButton>(R.id.btn1)
        btn2.setOnClickListener{
            /*supportFragmentManager.beginTransaction()
                .replace(R.id.container, Fragment0511212())
                .addToBackStack(null)
                .commit()*/
            val fragment1 = supportFragmentManager.findFragmentByTag("fragment1")
            val fragment2 = supportFragmentManager.findFragmentByTag("fragment2")
            supportFragmentManager.beginTransaction()
                .show(fragment2!!)
                .hide(fragment1!!)
                .commit()
        }
        val btn3 = findViewById<AppCompatButton>(R.id.btn1)
        btn3.setOnClickListener{
            startActivity(Intent)
        }
    }

    private fun initFragment(){
        supportFragmentManager.beginTransaction()
//            .replace(R.id.container, Fragment081121(),"fragment1")
            .add(R.id.container, Fragment081121(),"fragment1")
            .addToBackStack(null)
            .commit()
        supportFragmentManager.beginTransaction()
//            .replace(R.id.container, Fragment0811212(),"fragment2")
            .add(R.id.container, Fragment0811212(),"fragment2")
            .addToBackStack(null)
            .commit()
    }
}