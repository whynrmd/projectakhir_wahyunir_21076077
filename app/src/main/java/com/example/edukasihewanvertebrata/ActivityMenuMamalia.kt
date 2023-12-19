package com.example.edukasihewanvertebrata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityMenuMamalia : AppCompatActivity() {

    private lateinit var Btn1 : Button
    private lateinit var Btn2 : Button
    private lateinit var Btn3 : Button
    private lateinit var Btn4 : Button
    private lateinit var Btn5 : Button
    private lateinit var Btn6 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_mamalia)

        Btn1 = findViewById(R.id.mamalia_txt2)
        Btn2 = findViewById(R.id.mamalia_txt3)
        Btn3 = findViewById(R.id.mamalia_txt4)
        Btn4 = findViewById(R.id.mamalia_txt5)
        Btn5 = findViewById(R.id.mamalia_txt6)
        Btn6 = findViewById(R.id.mamalia_txt7)


        Btn1.setOnClickListener {
            val move = Intent(this@ActivityMenuMamalia, ActivityZebra::class.java)
            startActivity(move)
        }

        Btn2.setOnClickListener {
            val move = Intent(this@ActivityMenuMamalia, ActivityKucing::class.java)
            startActivity(move)
        }

        Btn3.setOnClickListener {
            val move = Intent(this@ActivityMenuMamalia, ActivityAnjing::class.java)
            startActivity(move)
        }

        Btn4.setOnClickListener {
            val move = Intent(this@ActivityMenuMamalia, ActivityPaus::class.java)
            startActivity(move)
        }

        Btn5.setOnClickListener {
            val move = Intent(this@ActivityMenuMamalia, ActivityLumbaLumba::class.java)
            startActivity(move)
        }

        Btn6.setOnClickListener {
            val move = Intent(this@ActivityMenuMamalia, ActivityOrangUtan::class.java)
            startActivity(move)
        }
    }
}