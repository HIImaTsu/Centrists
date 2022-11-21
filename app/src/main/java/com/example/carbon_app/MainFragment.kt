package com.example.carbon_app

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.carbon_app.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.signUp.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_mainFragment_to_signUpFragment)
        }

        return binding.root
    }
}

