package com.example.carbon_app

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.carbon_app.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }
}

