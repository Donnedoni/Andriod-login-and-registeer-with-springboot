package com.example.springboot_login

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException

private lateinit var tvLogin: TextView
private lateinit  var etUsername: EditText
private lateinit  var etPassword: EditText
private lateinit var btnRegister: Button

private lateinit var userName:String
private lateinit var password:String

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        //declare variable to be matched with with xml components


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        //initialize variable and bind them with the ids from the xml
        etUsername = findViewById(R.id.etRUserName)
        etPassword = findViewById(R.id.etRPassword)
        btnRegister = findViewById(R.id.btnRegister)
        tvLogin = findViewById(R.id.tvLoginLink)

        //the methods/ listeners
        btnRegister.setOnClickListener {
            //val name = etUsername.getText().toString();
            //Toast.makeText(this, name + "users has registered", Toast.LENGTH_SHORT).show();
            registerUser()
        }

        tvLogin.setOnClickListener {
            textViewClicked()
        }
    }


        private fun registerUser() {
            val userName: String = etUsername.getText().toString().trim()
            val password: String = etPassword.getText().toString().trim()
            if (userName.isEmpty()) {
                etUsername.setError("Username is required")
                etUsername.requestFocus()
                return
            } else if (password.isEmpty()) {
                etPassword.setError("Password is required")
                etPassword.requestFocus()
                return
            }
            val call: Call<ResponseBody> = RetrofitClient
                .getInstance()
                .api
                .createUser(User(userName, password))
            call.enqueue(object : Callback<ResponseBody?> {
                override fun onResponse(
                    call: Call<ResponseBody?>?,
                    response: Response<ResponseBody?>
                ) {
                    var s = ""
                    try {
                        s = response.body()!!.string()
                    } catch (e: IOException) {
                        e.printStackTrace()
                    }
                    val call: Call<ResponseBody> = RetrofitClient
                        .getInstance()
                        .api
                        .createUser(User(userName, password))
                    call.enqueue(object : Callback<ResponseBody?> {
                        override fun onResponse(
                            call: Call<ResponseBody?>,
                            response: Response<ResponseBody?>
                        ) {
                            var s = ""
                            try {
                                s = response.body()!!.string()
                                if (s == "SUCCESS") {
                                    Toast.makeText(
                                        this@RegisterActivity,
                                        "Successfully registered. Please login",
                                        Toast.LENGTH_LONG
                                    ).show()
                                    startActivity(
                                        Intent(
                                            this@RegisterActivity,
                                            LoginActivity::class.java
                                        )
                                    )
                                } else {
                                    Toast.makeText(
                                        this@RegisterActivity,
                                        "User already exists!",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                }

                            } catch (e: IOException) {
                                e.printStackTrace()
                            }
                        }

                        override fun onFailure(call: Call<ResponseBody?>, t: Throwable) {
                            TODO("Not yet implemented")
                        }

                    })
                }

                override fun onFailure(call: Call<ResponseBody?>, t: Throwable) {
                    TODO("Not yet implemented")
                }
            })
        }

    fun textViewClicked() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}






