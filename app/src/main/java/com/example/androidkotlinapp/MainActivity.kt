package com.example.androidkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvhello.text= "1"
    }

    fun addNumber(v: View){
        val currVal = tvhello.text.toString().toInt()
        val nextVal = currVal + 1
        tvhello.text = nextVal.toString()
    }
}