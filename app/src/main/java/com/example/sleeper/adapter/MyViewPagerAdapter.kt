package com.example.sleeper.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.sleeper.fragment.MainFragment
import com.example.sleeper.fragment.MissionFragment
import com.example.sleeper.fragment.MyPageFragment

class MyViewPagerAdapter(fragmentActivity: FragmentActivity):
    FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> { MainFragment().apply {
                    arguments = Bundle().apply {
                    }
                }
            }

            1 -> MissionFragment().apply {
                arguments = Bundle().apply {
                }
            }
            2 -> MyPageFragment().apply {
                arguments = Bundle().apply {
                }
            }
            else -> MainFragment()
        }
    }
}