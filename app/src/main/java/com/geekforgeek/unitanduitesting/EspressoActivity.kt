package com.geekforgeek.unitanduitesting

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.geekforgeek.unitanduitesting.Utility.EMAIL

class EspressoActivity : AppCompatActivity() {

    lateinit var etEmail:EditText
    lateinit var etPassword:EditText
    lateinit var loginBtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_espresso)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        loginBtn = findViewById(R.id.btnLogin)

        loginBtn.setOnClickListener {

            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra(EMAIL, etEmail.text.toString())
            startActivity(intent)
        }
    }
}