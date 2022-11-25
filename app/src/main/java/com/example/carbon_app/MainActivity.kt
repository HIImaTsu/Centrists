package com.example.carbon_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val username = (findViewById<TextView>(R.id.username))
        val password = (findViewById<TextView>(R.id.password))

    }
}
