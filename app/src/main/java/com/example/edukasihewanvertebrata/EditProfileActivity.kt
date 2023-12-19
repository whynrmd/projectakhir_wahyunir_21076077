package com.example.edukasihewanvertebrata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class EditProfileActivity : AppCompatActivity() {

    private lateinit var editTextUsername: EditText
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonSave: Button
    private lateinit var buttonBack: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        editTextUsername = findViewById(R.id.edit_username)
        editTextEmail = findViewById(R.id.edit_email)
        editTextPassword = findViewById(R.id.edit_password)
        buttonSave = findViewById(R.id.btnSave)
        buttonBack = findViewById(R.id.btnBack)

        buttonSave.setOnClickListener {
            saveData()
        }

        buttonBack.setOnClickListener {
            val move = Intent(this@EditProfileActivity, ProfileActivity::class.java)
            startActivity(move)
        }

    }

    private fun saveData() {
        val name = editTextUsername.text.toString()
        val email = editTextEmail.text.toString()
        val username = editTextPassword.text.toString()

        // TODO: Implement logic to save data (e.g., update user profile)

        // For now, just display a toast message
        showToast("Data saved successfully")
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}