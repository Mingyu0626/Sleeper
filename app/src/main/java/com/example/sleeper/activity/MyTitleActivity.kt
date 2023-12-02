package com.example.sleeper.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sleeper.databinding.ActivityMyTitleBinding

class MyTitleActivity : AppCompatActivity() {
    lateinit var binding: ActivityMyTitleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyTitleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initLayout()
    }

    private fun initLayout() {
        binding.apply {
            backBtnMyTitle.setOnClickListener {
                val intent = Intent(this@MyTitleActivity, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}