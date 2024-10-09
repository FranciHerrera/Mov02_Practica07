package com.example.mov2_mapa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnMapa: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMapa = findViewById(R.id.btnMapa)

        btnMapa.setOnClickListener { abrirActivityMapa() }

    }

    private fun abrirActivityMapa(){
        intent = Intent(this, MapsActivity::class.java)
        startActivity(intent)
    }

}