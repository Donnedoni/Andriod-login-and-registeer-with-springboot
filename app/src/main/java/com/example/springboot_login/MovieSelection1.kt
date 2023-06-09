package com.example.springboot_login

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MovieSelection1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_selection1)

        val imageView1 = findViewById<ImageView>(R.id.onward)
        imageView1.setOnClickListener {
            openYouTubeVideo("https://www.youtube.com/watch?v=gn5QmllRCn4&pp=ygUOb253YXJkIHRyYWlsZXI%3D")
        }

        val imageView2= findViewById<ImageView>(R.id.avatar)
        imageView2.setOnClickListener {
            openYouTubeVideo("https://www.youtube.com/watch?v=d9MyW72ELq0&pp=ygUQYXZhdGFyIDIgdHJhaWxlcg%3D%3D")
        }
        val imageView3 = findViewById<ImageView>(R.id.frozen)
        imageView3.setOnClickListener {
            openYouTubeVideo("https://www.youtube.com/watch?v=Zi4LMpSDccc&pp=ygUQZnJvemVuIDIgdHJhaWxlcg%3D%3D")
        }
        val imageView4 = findViewById<ImageView>(R.id.blackWidow)
        imageView4.setOnClickListener {
            openYouTubeVideo("https://www.youtube.com/watch?v=ybji16u608U&pp=ygUUYmxhY2sgd2lkb3cgdHJhaWxlciA%3D")
        }
        this.findViewById<Button>(R.id.next_button).setOnClickListener {
            startActivity(Intent(this, MovieSelection2::class.java))
        }
    }
    private fun openYouTubeVideo(videoUrl: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(videoUrl))
        startActivity(intent)
    }
}