package com.example.sleeper.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.sleeper.R
import com.example.sleeper.activity.MyBadgeActivity
import com.example.sleeper.activity.MyTitleActivity
import com.example.sleeper.databinding.FragmentMyPageBinding

class MyPageFragment : Fragment() {
    lateinit var binding: FragmentMyPageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMyPageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.apply {
            gotoMyBadge.setOnClickListener {
                val intent = Intent(activity, MyBadgeActivity::class.java)
                startActivity(intent)
            }

            gotoMyTitle.setOnClickListener {
                val intent = Intent(activity, MyTitleActivity::class.java)
                startActivity(intent)
            }
        }
    }

}