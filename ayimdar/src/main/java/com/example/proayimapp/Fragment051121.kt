package layout

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import com.example.proayimapp.MainActivity0511212
import com.example.proayimapp.R

class Fragment051121: Fragment(R.layout.fragment_1) {
    private lateinit var txt: AppCompatTextView /*= findViewById(id)*/

    override fun onAttach(context: Context){
        super.onAttach
    }

    override fun onViewCreated(view: View,savedInstance: Bundle?){
        super.onViewCreated(view,savedInstance)
        txt = view.findViewById(R.id.fragment_view)
        val edit = findViewById<AppCompatEditText>(R.id.edit_view)
        val btn = findViewById<AppCompatButton>(R.id.btn)
        btn.setOnClickListener{
            val listener = activity as? OnButtonClicked
            listener?.onButton
        }


    }

    fun setText(enteredtext: String){
        txt.text = enteredtext
    }
}