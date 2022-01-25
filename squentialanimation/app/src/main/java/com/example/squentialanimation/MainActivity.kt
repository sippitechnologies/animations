package com.example.squentialanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txt_label = findViewById<TextView>(R.id.txt_label)
        val animation = AnimationUtils.loadAnimation(this,R.anim.sequential)
        txt_label.startAnimation(animation)
    }
}