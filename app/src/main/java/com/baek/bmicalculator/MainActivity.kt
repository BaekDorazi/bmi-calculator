package com.baek.bmicalculator

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listener()
    }

    fun listener() {
        resultBtn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.resultBtn -> {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("height", etHeight.text.toString())
                intent.putExtra("weight", etWeight.text.toString())
                startActivity(intent)
            }
        }
    }
}
