package com.example.springboot_login

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MovieSelection2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_selection2)

        val imageView1 = findViewById<ImageView>(R.id.angryBird)
        imageView1.setOnClickListener {
            openYouTubeVideo("https://www.youtube.com/watch?v=QRmKa7vvct4&pp=ygUUYW5ncnkgYmlyZHMgdHJhaWxlciA%3D")
        }

        val imageView2= findViewById<ImageView>(R.id.shazam)
        imageView2.setOnClickListener {
            openYouTubeVideo("https://www.youtube.com/watch?v=AIc671o9yCI&pp=ygUQc2hhemFtIHRyYWlsZXIgMg%3D%3D")
        }
        val imageView3 = findViewById<ImageView>(R.id.parker)
        imageView3.setOnClickListener {
            openYouTubeVideo("https://www.youtube.com/watch?v=QGu6InUcdUY&pp=ygUPUGFya2VyIHRyYWlsZXIg")
        }
        val imageView4 = findViewById<ImageView>(R.id.turningRed)
        imageView4.setOnClickListener {
            openYouTubeVideo("https://www.youtube.com/watch?v=XdKzUbAiswE&pp=ygULdHVybmluZyByZWQ%3D")
        }

        this.findViewById<Button>(R.id.back_button).setOnClickListener {
            startActivity(Intent(this, MovieSelection1::class.java))
        }
    }
    private fun openYouTubeVideo(videoUrl: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(videoUrl))
        startActivity(intent)
    }
}