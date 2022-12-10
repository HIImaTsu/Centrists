package com.example.carbon_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SwitchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.cont, LoginFragmentTest())
            .commit()

    }
}