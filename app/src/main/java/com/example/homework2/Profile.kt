package com.example.homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        val firstNameTextView = findViewById<TextView>(R.id.first_name_value_textview)
        val lastNameTextView = findViewById<TextView>(R.id.last_name_value_textview)
        val gpaTextView = findViewById<TextView>(R.id.gpa_value_textview)


        val firstName = intent.getStringExtra("first_name")
        val lastName = intent.getStringExtra("last_name")
        val gpa = intent.getFloatExtra("gpa", 0f)


        firstNameTextView.text = firstName
        lastNameTextView.text = lastName
        gpaTextView.text = gpa.toString()





    }
}