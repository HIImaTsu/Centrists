package com.example.carbon_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.carbon_app.databinding.FragmentMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var button : Button
    private lateinit var button2 : Button
    private val mainFragment = MainFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.btn_frag1)
        button2 = findViewById(R.id.btn_frag2)

        button.setOnClickListener{
                setNewFragment(mainFragment)
        }

        button2.setOnClickListener{
             val secondFragment = SecondFragment()
                setNewFragment(secondFragment)
        }

    }

    private fun setNewFragment(fragment: Fragment) {
        val manager = supportFragmentManager.beginTransaction()
        manager.replace(R.id.frame_layout, fragment)
        manager.commit()
    }


}




//    private fun onClick(){
//
//
//        val username : TextView  = findViewById(R.id.username)
//        val password : TextView = findViewById(R.id.password)
//
//        if(username.text.toString() == "admin" && password.text.toString() == "admin"){
//            Toast.makeText(this,"LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show()
//        }else
//            Toast.makeText(this,"LOGIN FAILED!!!", Toast.LENGTH_SHORT).show()
//    }

//        val login2: Button = findViewById(R.id.loginbtn)
//        login2.setOnClickListener{
//            onClick()
//        }