package com.example.sleeper.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sleeper.R
import com.example.sleeper.databinding.ActivityRecordBinding

class RecordActivity : AppCompatActivity() {
    lateinit var binding: ActivityRecordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initLayout()
    }

    private fun initLayout() {
        binding.apply {
            gisangGirok.setOnClickListener {
                val intent = Intent(this@RecordActivity, ResultActivity::class.java)
                startActivity(intent)
            }
        }
    }
}