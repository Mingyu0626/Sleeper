package com.example.sleeper.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.sleeper.R
import com.example.sleeper.adapter.MissionViewPagerAdapter
import com.example.sleeper.databinding.FragmentMissionBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MissionFragment : Fragment() {
    lateinit var binding: FragmentMissionBinding
    lateinit var bnv: BottomNavigationView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMissionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private fun initFragment() {
    }

}