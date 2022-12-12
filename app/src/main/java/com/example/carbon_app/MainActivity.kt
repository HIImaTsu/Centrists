package com.example.carbon_app


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.carbon_app.data.AppDatabase
import com.example.carbon_app.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

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



    }


}




