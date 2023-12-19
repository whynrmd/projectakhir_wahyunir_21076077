package com.example.edukasihewanvertebrata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityMenuBurung : AppCompatActivity() {

    private lateinit var Btn1 : Button
    private lateinit var Btn2 : Button
    private lateinit var Btn3 : Button
    private lateinit var Btn4 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_burung)

        Btn1 = findViewById(R.id.burung_txt2)
        Btn2 = findViewById(R.id.burung_txt3)
        Btn3 = findViewById(R.id.burung_txt4)
        Btn4 = findViewById(R.id.burung_txt5)

        Btn1.setOnClickListener {
            val move = Intent(this@ActivityMenuBurung, ActivityPinguin::class.java)
            startActivity(move)
        }

        Btn2.setOnClickListener {
            val move = Intent(this@ActivityMenuBurung, ActivityMerpati::class.java)
            startActivity(move)
        }

        Btn3.setOnClickListener {
            val move = Intent(this@ActivityMenuBurung, ActivityFlamingo::class.java)
            startActivity(move)
        }

        Btn4.setOnClickListener {
            val move = Intent(this@ActivityMenuBurung, ActivityBebek::class.java)
            startActivity(move)
        }
    }
}