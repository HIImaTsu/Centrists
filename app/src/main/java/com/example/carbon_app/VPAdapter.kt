package com.example.carbon_app

import android.icu.text.CaseMap.Title
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class VPAdapter(fm: FragmentManager, behavior: Int) : FragmentPagerAdapter(fm, behavior) {

    private var fragmentArrayList: ArrayList<Fragment> = ArrayList()
    private var fragmentTitle: ArrayList<String> = ArrayList()


    override fun getCount(): Int {
        return fragmentArrayList.size
    }

    override fun getItem(position: Int): Fragment {
<<<<<<< HEAD
        return fragmentArrayList.get(position)
    }


=======
        return fragmentArrayList[position]
    }

    fun addFragment(Fragment: Fragment, title: String){

        fragmentArrayList.add(Fragment)
        fragmentTitle.add(title)
    }

    override fun getPageTitle(position: Int): CharSequence? {

        return fragmentTitle[position]
    }
>>>>>>> 482c44712054975ce10eef2ceeb9545b15102e82
}