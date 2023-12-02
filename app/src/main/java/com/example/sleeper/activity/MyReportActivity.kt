package com.example.sleeper.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sleeper.R
import com.example.sleeper.databinding.ActivityMainBinding
import com.example.sleeper.databinding.ActivityMyReportBinding

class MyReportActivity : AppCompatActivity() {
    lateinit var binding: ActivityMyReportBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyReportBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initLayout()
    }

    private fun initLayout() {
        binding.apply {
            backToMainBtn.setOnClickListener {
                val intent = Intent(this@MyReportActivity, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}