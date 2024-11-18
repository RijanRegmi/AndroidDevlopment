package com.example.firstmob

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class radiobuttonActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
        lateinit var Mango : RadioButton
        lateinit var Apple : RadioButton
        lateinit var Orange : RadioButton
        lateinit var Image : ImageView

        @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContentView(R.layout.activity_radio_linear)
            Mango = findViewById(R.id.mangoRadio)
            Apple = findViewById(R.id.appleRadio)
            Orange = findViewById(R.id.orangeRadio)
            Image = findViewById(R.id.imageRadio)

            Mango.setOnClickListener {
                Image.setImageResource(R.drawable.mango)
            }
            Apple.setOnClickListener {
                Image.setImageResource(R.drawable.apple)
            }
            Orange.setOnClickListener {
                Image.setImageResource(R.drawable.orange)
            }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}