package com.example.carbon_app

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
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

