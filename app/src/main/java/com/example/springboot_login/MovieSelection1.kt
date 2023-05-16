package com.example.springboot_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MovieSelection1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_selection1)

        this.findViewById<Button>(R.id.next_button).setOnClickListener {
            startActivity(Intent(this, MovieSelection2::class.java))
        }
    }
}