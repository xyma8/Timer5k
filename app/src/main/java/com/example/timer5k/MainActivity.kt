package com.example.timer5k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    lateinit var tTimer: TextView
    lateinit var etMin: EditText
    lateinit var etSec: EditText
    lateinit var bRestart: Button
    lateinit var tbOnOff: ToggleButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tTimer = (findViewById(R.id.textTimer)) as TextView
        etMin = (findViewById(R.id.editTextMin)) as EditText
        etSec = (findViewById(R.id.editTextSec)) as EditText
        bRestart = (findViewById(R.id.buttonRestart)) as Button
        tbOnOff = (findViewById(R.id.toggleButtonOnOff)) as ToggleButton
    }


}