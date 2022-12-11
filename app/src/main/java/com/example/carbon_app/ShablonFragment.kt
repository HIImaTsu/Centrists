package com.example.carbon_app

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.carbon_app.databinding.FragmentShablonBinding


class ShablonFragment : Fragment() {

    private val mainFragment = MainFragment()
    private val secondFragment = SecondFragment()
    private val thirdFragment = ThirdFragment()




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding = FragmentShablonBinding.inflate(inflater, container, false)

        setNewFragment(mainFragment)

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> setNewFragment(mainFragment)
                R.id.faculty -> setNewFragment(secondFragment)
                R.id.person -> setNewFragment(thirdFragment)

                R.id.exit -> {val intent = Intent(context, LoginActivity::class.java)
            startActivity(intent)
                }

                else -> {setNewFragment(mainFragment)}
            }
            true
        }
        return binding.root
    }

    private fun setNewFragment(fragment: Fragment) {
        val manager = childFragmentManager.beginTransaction()
        manager.replace(R.id.frame_layout, fragment)
        manager.addToBackStack(null)
        manager.commit()

            }

        }








