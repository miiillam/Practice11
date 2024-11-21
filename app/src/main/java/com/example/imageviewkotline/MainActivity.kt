package com.example.imageviewkotline

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.imageviewkotline.R

class MainActivity : AppCompatActivity() {

    private lateinit var imageView2: ImageView
    private var isChecked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView2 = findViewById(R.id.imageView2)
    }

    fun onClick(view: android.view.View) {

        imageView2.setImageResource(R.drawable.gun2)
    }

    fun onClickImage(view: android.view.View) {
        val imageButton: ImageButton = findViewById(R.id.button_image)
        if (isChecked) {
            imageButton.setImageResource(R.drawable.btn_check_buttonless_off)
        } else {
            imageButton.setImageResource(R.drawable.btn_check_buttonless_on)
        }
        isChecked = !isChecked
    }
}
