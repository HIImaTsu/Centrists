package com.example.carbon_app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.carbon_app.databinding.FragmentMainBinding


class MainFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = FragmentMainBinding.inflate(inflater, container, false)

//        binding.signUp.setOnClickListener { view: View ->
//            view.findNavController().navigate(R.id.action_mainFragment_to_secondFragment)
//        }

        return binding.root
    }
}

