package com.example.itents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_segunda2.*

class segunda : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda2)

        btnSolo.setOnClickListener {
            val miSegundoIntent = Intent(this,tercera::class.java)

            val  nombre = etNombre.text.toString()
            miSegundoIntent.putExtra("info",nombre)
            startActivity(miSegundoIntent)
        }
    }
}
