package com.example.uts_pmobile

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class PageLoginActivity : AppCompatActivity() {
    private lateinit var txtSignUp : TextView
    private lateinit var btnLogin2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_login)
        txtSignUp = findViewById(R.id.Sign_up)
        btnLogin2 = findViewById(R.id.btnlogin)

        txtSignUp.setOnClickListener() {
            intent = Intent(this@PageLoginActivity, PageRegisterActivity::class.java)
            startActivity(intent)
        }

        btnLogin2.setOnClickListener() {
            intent = Intent(this@PageLoginActivity, PageDisplayListActivity::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
    }
}