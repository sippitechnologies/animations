package com.sippitechnologies.fadeinfadout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
   lateinit var fadeIn:Animation
    lateinit var fadeOut:Animation
    lateinit var blink:Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fadeIn= AnimationUtils.loadAnimation(this,R.anim.fade_in)
        fadeOut= AnimationUtils.loadAnimation(this,R.anim.fade_out)
        blink= AnimationUtils.loadAnimation(this,R.anim.blink)

        btn_blink.setOnClickListener(this)
        btn_fadein.setOnClickListener(this)
        btn_fadeout.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
      when(p0?.id)
      {
          R.id.btn_blink-> textView.startAnimation(blink)
          R.id.btn_fadein-> textView.startAnimation(fadeIn)
          else->textView.startAnimation(fadeOut)

      }
    }
}