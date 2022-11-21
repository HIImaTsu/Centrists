package com.example.carbon_app

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.carbon_app.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentSignUpBinding.inflate(inflater, container, false)
        return binding.root
    }
}

