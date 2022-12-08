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
<<<<<<< HEAD
import com.google.android.material.tabs.TabItem
=======
>>>>>>> 482c44712054975ce10eef2ceeb9545b15102e82
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

<<<<<<< HEAD
=======
    private lateinit var tableLayout : TabLayout
    private lateinit var viewPager: ViewPager
    private val mainFragment = MainFragment()
    private val secondFragment = SecondFragment()
    private val thirdFragment = ThirdFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tableLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewpager)



        tableLayout.setupWithViewPager(viewPager)


        val vpAdapter = VPAdapter(supportFragmentManager, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)
        vpAdapter.addFragment(mainFragment, "1FLOOR")
        vpAdapter.addFragment(secondFragment, "2FLOOR")
        vpAdapter.addFragment(thirdFragment, "3FLOOR")
        viewPager.adapter = vpAdapter




>>>>>>> 482c44712054975ce10eef2ceeb9545b15102e82



    }

//    private fun setNewFragment(fragment: Fragment) {
//        val manager = supportFragmentManager.beginTransaction()
//        manager.replace(R.id.frame_layout, fragment)
//        manager.addToBackStack(null)
//        manager.commit()
//    }


}




