package com.example.sleeper.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.sleeper.R
import com.example.sleeper.activity.MyBadgeActivity
import com.example.sleeper.activity.MyReportActivity
import com.example.sleeper.activity.MyTitleActivity
import com.example.sleeper.activity.RecordActivity
import com.example.sleeper.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.apply {
            gotoReport.setOnClickListener {
                val intent = Intent(activity, MyReportActivity::class.java)
                startActivity(intent)
            }

            gotoRecord.setOnClickListener {
                val intent = Intent(activity, RecordActivity::class.java)
                startActivity(intent)
            }
        }
    }
}