package com.example.homework2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class List : AppCompatActivity() {

    private lateinit var homeImageView: ImageView
    private lateinit var profileImageView: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        homeImageView = findViewById(R.id.home_imageview)
        profileImageView = findViewById(R.id.profile_imageview)




        homeImageView.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        profileImageView.setOnClickListener {
            // Launch the ProfileActivity
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }


    }
}