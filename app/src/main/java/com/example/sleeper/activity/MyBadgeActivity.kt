package com.example.sleeper.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import com.example.sleeper.R
import com.example.sleeper.adapter.MyBadgeDataAdapter
import com.example.sleeper.data.BadgeData
import com.example.sleeper.databinding.ActivityMyBadgeBinding

class MyBadgeActivity : AppCompatActivity() {
    lateinit var binding: ActivityMyBadgeBinding
    val data:ArrayList<BadgeData> = ArrayList()
    lateinit var adapter: MyBadgeDataAdapter
    lateinit var spinner: Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyBadgeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initLayout()
    }

    private fun initLayout() {
        binding.apply {
            backBtnMyBadge.setOnClickListener {
                val intent = Intent(this@MyBadgeActivity, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}