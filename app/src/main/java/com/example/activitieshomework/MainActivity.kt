package com.example.activitieshomework

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activitieshomework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClickListeners()

    }

    private fun onClickListeners() {
        binding.getStartedButton.setOnClickListener {
            goToActivity(this, AuthActivity::class.java)
        }
    }

    private fun goToActivity(from: Context, to: Class<*>) {
        Intent(from, to).also {
            startActivity(it)
            finish()
        }
    }

}