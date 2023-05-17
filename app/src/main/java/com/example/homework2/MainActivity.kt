package com.example.homework2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var firstNameEditText: EditText
    private lateinit var lastNameEditText: EditText
    private lateinit var gpaEditText: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        firstNameEditText = findViewById(R.id.first_name_edittext)
        lastNameEditText = findViewById(R.id.last_name_edittext)
        gpaEditText = findViewById(R.id.gpa_edittext)

        val profileButton: Button = findViewById(R.id.profile_button)
        profileButton.setOnClickListener {
            val intent = Intent(this@MainActivity, Profile::class.java).apply {
                putExtra("firstName", firstNameEditText.text.toString())
                putExtra("lastName", lastNameEditText.text.toString())
                putExtra("gpa", gpaEditText.text.toString())
            }

            startActivity(intent)
        }

        profileButton.setOnLongClickListener {
            firstNameEditText.text.clear()
            lastNameEditText.text.clear()
            gpaEditText.text.clear()
            true
        }


        val listButton: Button = findViewById(R.id.list_button)
        listButton.setOnClickListener {
            val intent = Intent(this@MainActivity, List::class.java)
            startActivity(intent)
        }

    }
}