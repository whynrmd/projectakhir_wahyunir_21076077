package com.example.edukasihewanvertebrata

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    private lateinit var Desc1 : Button
    private lateinit var Desc2 : Button
    private lateinit var Desc3 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        Desc1 = findViewById(R.id.btnBuaya)
        Desc2 = findViewById(R.id.btnBiawak)
        Desc3 = findViewById(R.id.btnUlar)

        Desc1.setOnClickListener {
            val move = Intent(this@MenuActivity, ActivityBuaya::class.java)
            startActivity(move)
        }

        Desc2.setOnClickListener {
            val move = Intent(this@MenuActivity, ActivityBiawak::class.java)
            startActivity(move)
        }

        Desc3.setOnClickListener {
            val move = Intent(this@MenuActivity, ActivityUlar::class.java)
            startActivity(move)
        }
    }
}