package com.example.proayimapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment

class Fragment0811212: Fragment(R.layout.fragment0811212) {

    private lateinit var txt: AppCompatTextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txt = view.findViewById(R.id.fragment)

        val btn = view.findViewById<AppCompatButton>(R.id.fragment)
        btn.setOnClickListener{
            // -> send 'BBB'
        }
    }

    fun setValue(value: String){
        txt.text = value
    }
}