package com.jhost.eightball

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init(){
        val balls = intArrayOf(
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
        )

        val askBtn: Button = findViewById(R.id.askBtn)
        val ballImg: ImageView = findViewById(R.id.ballImg)

        setRandomImage(ballImg, balls)

        askBtn.setOnClickListener {
            setRandomImage(ballImg, balls)
        }
    }

    private fun setRandomImage(imageView: ImageView, balls: IntArray){
        imageView.setImageResource(balls[Random.nextInt(balls.size)])
    }
}