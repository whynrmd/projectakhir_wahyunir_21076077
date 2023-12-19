package com.example.edukasihewanvertebrata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    private lateinit var Edit: Button
    private lateinit var Logout: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        Edit = findViewById(R.id.btnEdit)
        Logout = findViewById(R.id.btnLogout)

        Edit.setOnClickListener {
            val move = Intent(this@ProfileActivity, EditProfileActivity::class.java)
            startActivity(move)
        }

        Logout.setOnClickListener {
            val move = Intent(this@ProfileActivity, MainActivity::class.java)
            startActivity(move)
        }
    }

}