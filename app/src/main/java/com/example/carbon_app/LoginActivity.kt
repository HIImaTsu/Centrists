package com.example.carbon_app

import android.content.Intent
import android.content.Intent.EXTRA_EMAIL
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {

    private val shablonFragment = ShablonFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        val login2: Button = findViewById(R.id.loginbtn)
        val imageViewGmail: ImageView = findViewById(R.id.mail)
        val imageViewMoodle: ImageView = findViewById(R.id.moodle)
        val imageViewSdu: ImageView = findViewById(R.id.mysdu)
        val TextView : TextView = findViewById(R.id.forgotpass)
        login2.setOnClickListener {
            onClick()
        }
        imageViewGmail.setOnClickListener {
            sendEmail()
        }
        imageViewMoodle.setOnClickListener {
            WebMoodle()
        }
        imageViewSdu.setOnClickListener {
            WebMySdu()
        }
        TextView.setOnClickListener {
            sendEmail()
        }
    }

    private fun onClick(){
        val username : TextView = findViewById(R.id.username)
        val password : TextView = findViewById(R.id.password)
        setNewFragment()
    }
        private fun setNewFragment() {

        val manager = supportFragmentManager.beginTransaction()
            val relativeLayout : RelativeLayout = findViewById(R.id.rev_layout)
            relativeLayout.removeAllViews()
        manager.add(R.id.rev_layout, shablonFragment)
            manager.addToBackStack(null)
        manager.commit()
    }

    private fun sendEmail(){
        val intent = Intent(Intent.ACTION_SENDTO)
        intent.data = Uri.parse("mailto:")
        intent.putExtra(Intent.EXTRA_TEXT, "Hello! I forgot my password")
        intent.putExtra(Intent.EXTRA_SUBJECT, "HELP")
        startActivity(intent)
    }
    private fun WebMoodle(){
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://moodle.sdu.edu.kz/login/index.php"))
        startActivity(intent)
    }
    private fun WebMySdu(){
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://oldmy.sdu.edu.kz/"))
        startActivity(intent)
    }


}





//        if(username.text.toString() == "admin" && password.text.toString() == "admin"){
//            setNewFragment()
//            // onClick event handler
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//
//        }else
//
//        binding = LoginBinding.inflate(layoutInflater)
//        setContentView(binding.root)


