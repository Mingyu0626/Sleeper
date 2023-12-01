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

class MissionFragment : Fragment(), BottomNavigationView.OnNavigationItemSelectedListener {
    private var binding: FragmentMissionBinding?=null
    lateinit var bnv: BottomNavigationView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mission, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bnv = binding!!.missionBottomNav
        binding!!.missionViewPager.adapter = MissionViewPagerAdapter(this)
        binding!!.missionViewPager.registerOnPageChangeCallback(
            object: ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    binding!!.missionBottomNav.menu.getItem(position).isChecked = true
                }
            }
        )
        binding!!.missionBottomNav.setOnNavigationItemSelectedListener(this)
    }

    private fun initFragment() {
    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.missionWeekly -> {
                // ViewPager의 현재 item에 첫 번째 화면을 대입
                binding!!.missionViewPager.currentItem = 0
                return true
            }
            R.id.missionMonthly -> {
                // ViewPager의 현재 item에 두 번째 화면을 대입
                binding!!.missionViewPager.currentItem = 1
                return true
            }
            else -> {
                return false
            }
        }
    }

}