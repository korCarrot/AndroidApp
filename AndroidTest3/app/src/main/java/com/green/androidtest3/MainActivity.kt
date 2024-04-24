package com.green.androidtest3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lateinit var btnNaver:Button

        setContentView(R.layout.activity_main)

        btnNaver=findViewById<Button>(R.id.btnNaver)

        btnNaver.setOnClickListener{
            var intent=Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"))
            startActivity(intent)
        }
    }
}