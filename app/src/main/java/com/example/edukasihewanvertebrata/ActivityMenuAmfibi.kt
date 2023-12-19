package com.example.edukasihewanvertebrata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityMenuAmfibi : AppCompatActivity() {

    private lateinit var Btn1 : Button
    private lateinit var Btn2 : Button
    private lateinit var Btn3 : Button
    private lateinit var Btn4 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_amfibi)

        Btn1 = findViewById(R.id.amfibi_txt2)
        Btn2 = findViewById(R.id.amfibi_txt3)
        Btn3 = findViewById(R.id.amfibi_txt4)
        Btn4 = findViewById(R.id.amfibi_txt5)

        Btn1.setOnClickListener {
            val move = Intent(this@ActivityMenuAmfibi, ActivityAxolotl::class.java)
            startActivity(move)
        }

        Btn2.setOnClickListener {
            val move = Intent(this@ActivityMenuAmfibi, ActivityCaecilian::class.java)
            startActivity(move)
        }

        Btn3.setOnClickListener {
            val move = Intent(this@ActivityMenuAmfibi, ActivitySalamander::class.java)
            startActivity(move)
        }

        Btn4.setOnClickListener {
            val move = Intent(this@ActivityMenuAmfibi, ActivityDiplocaulus::class.java)
            startActivity(move)
        }
    }
}