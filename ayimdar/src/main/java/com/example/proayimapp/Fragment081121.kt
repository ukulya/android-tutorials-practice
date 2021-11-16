package com.example.proayimapp
import android.content.Context
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment

class Fragment081121: Fragment(R.layout.fragment081121) {

    private lateinit var listener: OnClickListener

    override fun onAttach(context: Context){
        super.onAttach(context)
        listener
    }

    override fun onViewCreated(view: View,savedInstanceState: Bundle?){
        super.onViewCreated(view,savedInstanceState)

        val btn = view.findViewById
    }
}