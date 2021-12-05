package com.example.authentificationprofile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {


    private lateinit var emailText: EditText
    private lateinit var passwordText: EditText
    private lateinit var loginButton: Button
    private lateinit var registerButton: Button
    private lateinit var resetPassButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    init()

    registerListeners()



    }

    private fun init(){
        emailText = findViewById(R.id.EmailText)
        passwordText = findViewById(R.id.PasswordText)
        loginButton = findViewById(R.id.LoginButton)
        registerButton = findViewById(R.id.registerButton)
        resetPassButton = findViewById(R.id.resetPassButton)
    }

    private fun registerListeners() {


        registerButton.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        resetPassButton.setOnClickListener {
            val intent = Intent(this,ResetPasswordActivity :: class.java )
        }

        loginButton.setOnClickListener {
            val email = emailText.text.toString()
            val password = passwordText.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "შეიყვანეთ მეილი და პაროლი", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }



        }


    }

}