package com.example.edukasihewanvertebrata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class KategoriActivity : AppCompatActivity() {

    private lateinit var Btn1 : Button
    private lateinit var Btn2 : Button
    private lateinit var Btn3 : Button
    private lateinit var Btn4 : Button
    private lateinit var Btn5 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategori)

        Btn1 = findViewById(R.id.btnMamalia)
        Btn2 = findViewById(R.id.btnIkan)
        Btn3 = findViewById(R.id.btnAmfibi)
        Btn4 = findViewById(R.id.btnReptil)
        Btn5 = findViewById(R.id.btnBurung)

        Btn1.setOnClickListener {
            val move = Intent(this@KategoriActivity, ActivityMenuMamalia::class.java)
            startActivity(move)
        }

        Btn2.setOnClickListener {
            val move = Intent(this@KategoriActivity, ActivityMenuIkan::class.java)
            startActivity(move)
        }

        Btn3.setOnClickListener {
            val move = Intent(this@KategoriActivity, ActivityMenuAmfibi::class.java)
            startActivity(move)
        }

        Btn4.setOnClickListener {
            val move = Intent(this@KategoriActivity, ActivityMenuReptil::class.java)
            startActivity(move)
        }

        Btn5.setOnClickListener {
            val move = Intent(this@KategoriActivity, ActivityMenuBurung::class.java)
            startActivity(move)
        }
    }
}