package com.example.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val buttonRegister  = findViewById<Button>(R.id.buttonRegister)

        buttonRegister.setOnClickListener{
            var UserName = findViewById<EditText>(R.id.userForm)
            Log.d("usuario: ", UserName.toString())
        }

    }

}