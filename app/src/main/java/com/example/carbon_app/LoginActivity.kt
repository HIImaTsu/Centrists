package com.example.carbon_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val login2: Button = findViewById(R.id.loginbtn)
        login2.setOnClickListener {
            onClick()
        }
    }


    private fun onClick(){
        val username : TextView = findViewById(R.id.username)
        val password : TextView = findViewById(R.id.password)

        if(username.text.toString() == "admin" && password.text.toString() == "admin"){
            Toast.makeText(this,"LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show()
            // onClick event handler
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }else
            Toast.makeText(this,"LOGIN FAILED!!!", Toast.LENGTH_SHORT).show()
    }


}