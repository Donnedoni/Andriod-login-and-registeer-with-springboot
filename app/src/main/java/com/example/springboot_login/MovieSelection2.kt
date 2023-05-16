package com.example.springboot_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MovieSelection2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_selection2)

        this.findViewById<Button>(R.id.back_button).setOnClickListener {
            startActivity(Intent(this, MovieSelection1::class.java))
        }
    }
}