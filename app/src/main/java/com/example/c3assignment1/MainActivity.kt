package com.example.c3assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Btn_Login.setOnClickListener{
            val newIntent = Intent(this, login::class.java)
            startActivity(newIntent)
        }
        Btn_Register.setOnClickListener{
            val newIntent = Intent(this, register::class.java)
            startActivity(newIntent)
        }
    }
}