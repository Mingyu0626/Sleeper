package com.example.sleeper.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.sleeper.fragment.*

class MissionViewPagerAdapter(fragmentActivity: MissionFragment):
    FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> { WeeklyMissionFragment().apply {
                    arguments = Bundle().apply {
                    }
                }
            }

            1 -> MonthlyMissionFragment().apply {
                arguments = Bundle().apply {
                }
            }

            else -> WeeklyMissionFragment()
        }
    }
}