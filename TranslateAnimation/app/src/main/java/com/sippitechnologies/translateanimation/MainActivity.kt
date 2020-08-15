package com.sippitechnologies.translateanimation

import android.graphics.drawable.Animatable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_bothside.setOnClickListener(this)
        btn_move_left.setOnClickListener(this)
        btn_move_right.setOnClickListener(this)
        btn_move_bottom.setOnClickListener(this)
        btn_move_up.setOnClickListener(this)
        btn_bounce.setOnClickListener(this)




    }
    fun getAnimation(animationId:Int)=AnimationUtils.loadAnimation(this,animationId)

    override fun onClick(p0: View?) {
        val animation = when(p0?.id)
        {
            R.id.btn_bothside-> getAnimation(R.anim.both)
            R.id.btn_bounce->getAnimation(R.anim.bounce)
            R.id.btn_move_bottom->getAnimation(R.anim.move_down)
            R.id.btn_move_up->getAnimation(R.anim.move_up)
            R.id.btn_move_left->getAnimation(R.anim.move_left)
                else->getAnimation(R.anim.move_right)

        }
        imageView.startAnimation(animation)
    }
}