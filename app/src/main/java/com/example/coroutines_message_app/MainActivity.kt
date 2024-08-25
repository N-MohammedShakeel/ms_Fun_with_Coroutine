package com.example.coroutines_message_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.coroutines_message_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val submit = findViewById<TextView>(R.id.hide)


        submit.setOnClickListener {

                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
                finish()

            }
    }
}


