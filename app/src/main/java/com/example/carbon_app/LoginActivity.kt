package com.example.carbon_app

import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {

    private val shablonFragment = ShablonFragment()
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
        setNewFragment()


    }
        private fun setNewFragment() {

        val manager = supportFragmentManager.beginTransaction()
            val relativeLayout : RelativeLayout = findViewById(R.id.rev_layout)
            relativeLayout.removeAllViews()
        manager.add(R.id.rev_layout, shablonFragment)
            manager.addToBackStack(null)
        manager.commit()
    }


}





//        if(username.text.toString() == "admin" && password.text.toString() == "admin"){
//            setNewFragment()
//            // onClick event handler
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//
//        }else
//
//        binding = LoginBinding.inflate(layoutInflater)
//        setContentView(binding.root)


