package com.example.alltogetheranimation

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val alltogetherAnimation = AnimationUtils.loadAnimation(this, R.anim.alltogether)
        imageView.startAnimation(alltogetherAnimation)
    }
}