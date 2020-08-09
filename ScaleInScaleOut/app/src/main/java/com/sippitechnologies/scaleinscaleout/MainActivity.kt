package com.sippitechnologies.scaleinscaleout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
    lateinit var zoomIn:Animation
    lateinit var zoomOut:Animation
    lateinit var zoomOutX:Animation
    lateinit var zoomOutY:Animation
    lateinit var zoomInandOut:Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        zoomIn= AnimationUtils.loadAnimation(this,R.anim.zoom_in)
        zoomOut= AnimationUtils.loadAnimation(this,R.anim.zoom_out)
        zoomOutX= AnimationUtils.loadAnimation(this,R.anim.zoom_in_)
        zoomOutY= AnimationUtils.loadAnimation(this,R.anim.zoom_y)
        zoomInandOut= AnimationUtils.loadAnimation(this,R.anim.zoom_inout)
        btn_zoomin.setOnClickListener(this)
        btn_zoomout.setOnClickListener(this)
        btn_zoominandout.setOnClickListener(this)
        btn_zoomx.setOnClickListener(this)
        btn_zoomy.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id)
        {
            R.id.btn_zoomin-> textView.startAnimation(zoomIn)
            R.id.btn_zoomout-> textView.startAnimation(zoomOut)
            R.id.btn_zoomx-> textView.startAnimation(zoomOutX)
            R.id.btn_zoomy-> textView.startAnimation(zoomOutY)
            else-> textView.startAnimation(zoomInandOut)
        }
    }
}