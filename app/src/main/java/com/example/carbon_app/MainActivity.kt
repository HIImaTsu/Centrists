package com.example.carbon_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.viewpager.widget.ViewPager
import com.example.carbon_app.databinding.FragmentMainBinding
import com.google.android.material.tabs.TabItem
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var tabItem: TabItem
    private lateinit var tabItem2: TabItem
    private lateinit var tabItem3: TabItem
    private val secondFragment = SecondFragment()
    private val thirdFragment = ThirdFragment()
    private val mainFragment = MainFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabItem = findViewById(R.id.first)
        tabItem2 = findViewById(R.id.second)
        tabItem3 = findViewById(R.id.third)

        tabItem.setOnClickListener{
            setNewFragment(mainFragment)
        }
        tabItem2.setOnClickListener{
            setNewFragment(secondFragment)
        }
        tabItem3.setOnClickListener{
            setNewFragment(thirdFragment)
        }
    }

    private fun setNewFragment(fragment: Fragment) {
        val manager = supportFragmentManager.beginTransaction()
        manager.replace(R.id.frame_layout, fragment)
        manager.addToBackStack(null)
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