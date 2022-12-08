package com.example.carbon_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TableLayout
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentTransaction
import androidx.viewpager.widget.ViewPager
import com.example.carbon_app.databinding.FragmentMainBinding

import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {


    private val mainFragment = MainFragment()
    private val secondFragment = SecondFragment()
    private val thirdFragment = ThirdFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    private fun setNewFragment(fragment: Fragment) {
//        val manager = supportFragmentManager.beginTransaction()
//        manager.replace(R.id.frame_layout, fragment)
//        manager.addToBackStack(null)
//        manager.commit()
//    }


}




