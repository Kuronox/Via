package com.example.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val buttonLogin    = findViewById<Button>(R.id.buttonLogin)
        val buttonRegister = findViewById<Button>(R.id.registerButton)

        //val req =  Request()
        // req.getMethod()

        //val post = Request()
        //post.postMethod()

        buttonLogin.setOnClickListener{
            startActivity (Intent (this, DashboardSord::class.java))
        }

        buttonRegister.setOnClickListener{
            startActivity (Intent (this, RegisterActivity::class.java))
        }


    }


}