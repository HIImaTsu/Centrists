package com.example.carbon_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val username = (findViewById<TextView>(R.id.username))
        val password = (findViewById<TextView>(R.id.password))

        var loginbtn = (findViewById<MaterialButton>(R.id.loginbtn))

        loginbtn.setOnClickListener(View.OnClickListener {
//pustota zapolni
        })
    }
}
