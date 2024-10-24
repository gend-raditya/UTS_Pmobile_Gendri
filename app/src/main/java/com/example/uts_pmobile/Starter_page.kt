package com.example.uts_pmobile

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uts_pmobile.R.id

class Starter_page : AppCompatActivity() {

    private lateinit var btnLogIn : Button
    private lateinit var btnSignUp : Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_starter_page)

        btnLogIn = findViewById(R.id.btn_login)
        btnSignUp = findViewById(R.id.btn_signup)

        btnLogIn.setOnClickListener() {
            intent = Intent(this@Starter_page, PageLoginActivity::class.java)
            startActivity(intent)
        }

        btnSignUp.setOnClickListener() {
            intent = Intent(this@Starter_page, PageRegisterActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
    }
}