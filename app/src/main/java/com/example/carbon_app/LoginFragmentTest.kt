package com.example.carbon_app

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.carbon_app.databinding.FragmentTestBinding


class LoginFragmentTest : Fragment() {
    private val shablonFragment = ShablonFragment()


    @SuppressLint("SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentTestBinding.inflate(inflater, container, false)

        binding.loginbtn.setOnClickListener {
            val manager = childFragmentManager.beginTransaction()
            binding.frameLayouttt.removeAllViews()
            manager.replace(R.id.frame_layouttt, shablonFragment)
            manager.commit()

        }

        return binding.root
    }
}