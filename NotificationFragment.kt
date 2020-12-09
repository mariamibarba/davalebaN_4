package com.example.myapplication133.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapplication133.R

class NotificationFragment:Fragment(R.layout.fragment_notification) {

    private lateinit var  textView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView=view.findViewById(R.id.textView2)

        textView.text=NotificationFragmentArgs.fromBundle(requireArguments()).amount.toString()
    }
}