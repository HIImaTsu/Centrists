package com.example.carbon_app

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.carbon_app.data.AppDatabase
import com.example.carbon_app.data.Office_num
import com.example.carbon_app.databinding.ActivityMainBinding
import com.example.carbon_app.databinding.FragmentLoginBinding
import com.example.carbon_app.databinding.FragmentShablonBinding
import com.example.carbon_app.databinding.FragmentThirdBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class ThirdFragment : Fragment() {


    private lateinit var appDb : AppDatabase
    lateinit var binding2 : FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding = FragmentShablonBinding.inflate(inflater, container, false)
        binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.person -> readData()

            }
            true
        }
        return binding.root
    }

    private fun writeData() {

        val firsName = binding2.username.text.toString()

        if (firsName.isNotEmpty()) {
            firsName
        }
        GlobalScope.launch(Dispatchers.IO) {


        }
    }

    private fun readData(){

    }
}




