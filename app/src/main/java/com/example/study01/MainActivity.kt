package com.example.study01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            textView.text = "맑은 날"
            imageView.setImageResource(R.drawable.sunny04)
        }
        button2.setOnClickListener {
            textView.text = "흐린 날"
            imageView.setImageResource(R.drawable.cloudy02)
        }
        button3.setOnClickListener {
            textView.text = "비오는 날"
            imageView.setImageResource(R.drawable.rainy01)
        }
    }
}