package com.example.myrangebar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        rangeSeekbar3.setOnRangeSeekbarChangeListener { minValue, maxValue ->

            rangeText.setText("range from : $minValue ---- $maxValue ")
        }

    }
}
