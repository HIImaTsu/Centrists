package com.example.carbon_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class DetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        val faculty =  intent.getParcelableExtra<Faculty>("faculty")
         if (faculty != null){
             val textView : TextView = findViewById(R.id.detailedActivityTv)
             val imageView : ImageView = findViewById(R.id.imageView)

             textView.text = faculty.name
             imageView.setImageResource(faculty.image)
             textView.text
         }
    }
}