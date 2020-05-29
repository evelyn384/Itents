package com.example.itents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSegunda.setOnClickListener {
            val miIntent = Intent(this, segunda::class.java)
            startActivity(miIntent)

        }
    btnTercera.setOnClickListener {
        val miIntent = Intent(this, tercera::class.java)
        startActivity(miIntent)
    }
}
}
