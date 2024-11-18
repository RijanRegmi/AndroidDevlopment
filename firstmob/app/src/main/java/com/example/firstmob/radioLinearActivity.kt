package com.example.firstmob

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class radioLinearActivity : AppCompatActivity() {
    lateinit var mango : RadioButton
    lateinit var apple : RadioButton
    lateinit var orange : RadioButton
    lateinit var image : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio_linear)
        mango = findViewById(R.id.mango_radioButton)
        apple = findViewById(R.id.apple_radioButton)
        orange = findViewById(R.id.orange_radioButton)
        image = findViewById(R.id.apple_Image)

        mango.setOnClickListener{
            image.setImageResource(R.drawable.mango)
        }
        apple.setOnClickListener{
            image.setImageResource(R.drawable.apple)
        }
        orange.setOnClickListener{
            image.setImageResource(R.drawable.orange)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}