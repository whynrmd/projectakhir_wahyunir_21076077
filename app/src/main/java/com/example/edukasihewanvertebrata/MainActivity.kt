package com.example.edukasihewanvertebrata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var textRegister: TextView
    private lateinit var btnLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textRegister = findViewById(R.id.txt_register)
        btnLogin = findViewById(R.id.L_btn1)

        textRegister.setOnClickListener(this)
        btnLogin.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.txt_register -> {
                val moveRegis = Intent(this@MainActivity, RegisterActivity::class.java)
                startActivity(moveRegis)
            }

            R.id.L_btn1 -> {
                val moveRegis = Intent(this@MainActivity, HomeActivity::class.java)
                startActivity(moveRegis)
            }
        }
    }
}