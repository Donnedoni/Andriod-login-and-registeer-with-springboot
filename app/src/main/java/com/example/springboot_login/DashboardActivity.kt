package com.example.springboot_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class DashboardActivity : AppCompatActivity() {
   lateinit var welcomeText: String;
    lateinit var tvWelcome: TextView
    //lateinit var intent: Intent;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
      // intent= Intent(this, LoginActivity::class.java)
     welcomeText ="Welcome "+ getIntent().getStringExtra("Username").toString() + "!";
      tvWelcome = this.findViewById(R.id.tvWelcome);
        tvWelcome.setText(welcomeText);

    }
}