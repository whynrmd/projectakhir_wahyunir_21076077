package com.example.edukasihewanvertebrata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.Menu
import android.view.View
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    private lateinit var Mulai : Button
    private lateinit var Profile : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

       Mulai = findViewById(R.id.btnMulai)
        Profile = findViewById(R.id.btnProfile)

        Mulai.setOnClickListener {
            val move = Intent(this@HomeActivity, KategoriActivity::class.java)
            startActivity(move)
        }

        Profile.setOnClickListener {
            val move = Intent(this@HomeActivity, ProfileActivity::class.java)
            startActivity(move)
        }
    }

}

