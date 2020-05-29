package com.example.itents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_tercera.*

class tercera : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tercera)

        btnPrimera.setOnClickListener {
            val miIntent = Intent(this, MainActivity::class.java)
            startActivity(miIntent)

        }

        val mensaje = intent.getStringExtra("info")

        if (mensaje != null){
            tvMensaje.text = mensaje
        }else{
            tvMensaje.text = "No se recibió nada"
        }
    }
}
