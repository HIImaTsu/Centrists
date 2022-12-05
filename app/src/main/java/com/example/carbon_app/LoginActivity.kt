package com.example.carbon_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.LiveData

class LoginActivity : AppCompatActivity() {

    private lateinit var username: TextView
    private lateinit var password: TextView
    private lateinit var currentAttempt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

//        val manager = supportFragmentManager.beginTransaction()
//        manager.replace(R.id.rev_layout, loginFragment)
//        manager.addToBackStack(null)
//        manager.commit()


        val login2: Button = findViewById(R.id.loginbtn)
        login2.setOnClickListener {
            onClick()
        }
    }


            private fun onClick(){
                currentAttempt = findViewById(R.id.attempt_left)

                username = findViewById(R.id.username)
                password = findViewById(R.id.password)

        if(username.text.toString() == "admin" && password.text.toString() == "admin"){
            Toast.makeText(this,"LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }else
            currentAttempt.text = "2"
            Toast.makeText(this,"LOGIN FAILED!!!", Toast.LENGTH_SHORT).show()
    }
    }



