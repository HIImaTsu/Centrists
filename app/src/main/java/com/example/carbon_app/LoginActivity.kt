package com.example.carbon_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.carbon_app.databinding.FragmentLoginBinding
import com.example.carbon_app.databinding.LoginBinding
import kotlinx.android.synthetic.main.fragment_shablon.*


class LoginActivity : AppCompatActivity() {

    private val shablonFragment = ShablonFragment()
    private lateinit var binding: LoginBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        val login2: Button = findViewById(R.id.loginbtn)
        login2.setOnClickListener {
            onClick()
        }

    }


    private fun onClick(){
        val username : TextView = findViewById(R.id.username)
        val password : TextView = findViewById(R.id.password)
        setNewFragment()

//        if(username.text.toString() == "admin" && password.text.toString() == "admin"){
//            setNewFragment()
//            // onClick event handler
////            val intent = Intent(this, MainActivity::class.java)
////            startActivity(intent)
//11
//        }else
//            Toast.makeText(this,"LOGIN FAILED!!!", Toast.LENGTH_SHORT).show()
    }
        private fun setNewFragment() {

        val manager = supportFragmentManager.beginTransaction()
        manager.replace(R.id.rev_layout, ShablonFragment())
        manager.commit()
    }


}
//        binding = LoginBinding.inflate(layoutInflater)
//        setContentView(binding.root)

//        navController = Navigation.findNavController(this , R.id.frame_layout)
//        setupWithNavController(binding.shablonFragment.bottomNavigationView , navController)

