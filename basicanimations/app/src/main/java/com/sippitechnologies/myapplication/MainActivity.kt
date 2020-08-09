package com.sippitechnologies.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fadeInAnimation=AnimationUtils.loadAnimation(this,R.anim.fade_in)
        val fadeOutAnimation=AnimationUtils.loadAnimation(this,R.anim.fadeout)
        val scaleInAnimation=AnimationUtils.loadAnimation(this,R.anim.scale_in)
        val scaleOutAnimation=AnimationUtils.loadAnimation(this,R.anim.scale_out)
        val clockwiseAnimation=AnimationUtils.loadAnimation(this,R.anim.roatate_clockwise)
        val anticlosewiseAnimation=AnimationUtils.loadAnimation(this,R.anim.rotate_anticlosewise)
        val slideoutRight = AnimationUtils.loadAnimation(this,R.anim.slide_out_right)
        val slideinleft= AnimationUtils.loadAnimation(this,R.anim.slide_in_left)
        val slidefromtop = AnimationUtils.loadAnimation(this,R.anim.slide_in_top)
        val slidefrombottom= AnimationUtils.loadAnimation(this,R.anim.slide_out_bottom)

        android.R.anim.slide_out_right

        tv_fade_in.setOnClickListener {


            imageView.startAnimation(fadeInAnimation)
        }
        text_fade_out.setOnClickListener {

            imageView.startAnimation(fadeOutAnimation)

        }
        btn_scale_in.setOnClickListener {


            imageView.startAnimation(scaleInAnimation)
        }
        btn_scale_out.setOnClickListener {

            imageView.startAnimation(scaleOutAnimation)

        }
        btn_clockwise.setOnClickListener {


            imageView.startAnimation(clockwiseAnimation)
        }
        btn_anticlosewise.setOnClickListener {

            imageView.startAnimation(anticlosewiseAnimation)

        }
        btn_slideleft.setOnClickListener {


            imageView.startAnimation(slideinleft)
        }
        btnslide_right.setOnClickListener {

            imageView.startAnimation(slideoutRight)

        }
        btn_slidefrombottom.setOnClickListener {
            imageView.startAnimation(slidefrombottom)
        }

        btn_slidefromtop.setOnClickListener {
            imageView.startAnimation(slidefromtop)
        }



    }
}