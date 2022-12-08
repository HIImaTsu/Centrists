package com.example.carbon_app

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.example.carbon_app.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var username : TextView
    private lateinit var password : TextView
    private lateinit var currentAttempt : TextView
    private val viewModel: AttemptViewModel by viewModels()

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentLoginBinding.inflate(inflater, container, false)

                binding.loginbtn.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_loginFragment_to_mainActivity)

        }
        return binding.root
}
    }

//            if(binding.username.text.toString() == "admin" && binding.password.text.toString() == "admin"){
//                val intent = Intent(this, MainActivity::class.java)
//                startActivity(intent)
//
//            }else
//                currentAttempt.text = "2"
//            Toast.makeText(this,"LOGIN FAILED!!!", Toast.LENGTH_SHORT).show()
//        }

