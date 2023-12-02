package com.example.sleeper.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import com.example.sleeper.adapter.MyReportDataAdapter
import com.example.sleeper.adapter.MyTitleDataAdapter
import com.example.sleeper.data.TitleData
import com.example.sleeper.databinding.ActivityMyTitleBinding

class MyTitleActivity : AppCompatActivity() {
    lateinit var binding: ActivityMyTitleBinding
    val data:ArrayList<TitleData> = ArrayList()
    lateinit var adapter: MyTitleDataAdapter
    lateinit var spinner: Spinner
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