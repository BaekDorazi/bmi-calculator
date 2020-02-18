package com.baek.bmicalculator

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activty_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activty_result)

        val height = intent.getStringExtra("height").toInt()
        val weight = intent.getStringExtra("weight").toInt()

        val bmi = weight / Math.pow(height / 100.0, 2.0)

        when {
            bmi >= 35 -> {
                tvResult.text = "고도 비만"
                tvResult.setTextColor(Color.parseColor("#FF6820"))
                ivIcon.setImageResource(R.drawable.ic_sentiment_very_dissatisfied_black_24dp)
            }
            bmi >= 30 -> {
                tvResult.text = "2단계 비만"
                tvResult.setTextColor(Color.parseColor("#452925"))
                ivIcon.setImageResource(R.drawable.ic_mood_bad_black_24dp)
            }
            bmi >= 25 -> {
                tvResult.text = "1단계 비만"
                tvResult.setTextColor(Color.parseColor("#F3FC55"))
                ivIcon.setImageResource(R.drawable.ic_sentiment_dissatisfied_black_24dp)
            }
            bmi >= 23 -> {
                tvResult.text = "과체중"
                tvResult.setTextColor(Color.parseColor("#7A7223"))
                ivIcon.setImageResource(R.drawable.ic_sentiment_satisfied_black_24dp)
            }
            bmi >= 18.5 -> {
                tvResult.text = "정상"
                tvResult.setTextColor(Color.parseColor("#AAF0D1"))
                ivIcon.setImageResource(R.drawable.ic_sentiment_very_satisfied_black_24dp)
            }
            else -> {
                tvResult.text = "저체중"
                tvResult.setTextColor(Color.parseColor("#40003A"))
                ivIcon.setImageResource(R.drawable.ic_sentiment_neutral_black_24dp)
            }
        }
    }
}