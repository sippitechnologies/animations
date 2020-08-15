package com.sippitechnologies.rotateanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener{

    lateinit var clock_wise:Animation
        lateinit var anti_clock_wise:Animation
   lateinit var both:Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         clock_wise = AnimationUtils.loadAnimation(this,R.anim.clock_wise)
        anti_clock_wise = AnimationUtils.loadAnimation(this,R.anim.anit_clock_wise)
         both = AnimationUtils.loadAnimation(this,R.anim.anitclock_andclockwise)
        btn_clockwise.setOnClickListener(this)
        btn_anticlockwise.setOnClickListener(this)
        btn_roate_bothside.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
     val animation =  when(p0?.id)
       {
           R.id.btn_anticlockwise-> anti_clock_wise
           R.id.btn_clockwise -> clock_wise
           else-> both
       }
        textView.startAnimation(animation)
    }
}