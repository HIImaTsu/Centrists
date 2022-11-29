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
    private val secondFragment = SecondFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.btn_frag1)
        button2 = findViewById(R.id.btn_frag2)

        button.setOnClickListener{
                setNewFragment(mainFragment)
        }
        button2.setOnClickListener{
                setNewFragment(secondFragment)
        }

    }

    private fun setNewFragment(fragment: Fragment) {
        val manager = supportFragmentManager.beginTransaction()
        manager.replace(R.id.frame_layout, fragment)
        manager.addToBackStack(null)
        manager.commit()
    }


}




