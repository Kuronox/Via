package com.example.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DashboardSord : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_sord)

        val buttonLogin = findViewById<Button>(R.id.ButtonService)

        buttonLogin.setOnClickListener{
            startActivity (Intent (this, Agentes_Service::class.java))
        }
    }
}