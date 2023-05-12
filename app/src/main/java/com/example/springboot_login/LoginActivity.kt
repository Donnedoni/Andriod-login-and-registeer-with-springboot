package com.example.springboot_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

private lateinit var tvRegister:TextView;
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        tvRegister = findViewById(R.id.tvRegisterLink)

        tvRegister.setOnClickListener {
            textViewClicked()
        }
    }
    fun textViewClicked() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }
}