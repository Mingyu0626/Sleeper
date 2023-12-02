package com.example.sleeper.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.viewpager2.widget.ViewPager2
import com.example.sleeper.R
import com.example.sleeper.adapter.MyViewPagerAdapter
import com.example.sleeper.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    lateinit var binding: ActivityMainBinding
    lateinit var bnv: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        bnv = binding.bottomNav
        setContentView(binding.root)
        initLayout()
        initFragment()
    }

    private fun initFragment() {
        val fragment = supportFragmentManager.beginTransaction()
        fragment.commit()
    }

    private fun initLayout() {
        binding.viewpager.adapter = MyViewPagerAdapter(this)

        binding.viewpager.registerOnPageChangeCallback(
            object: ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    binding.bottomNav.menu.getItem(position).isChecked = true
                }
            }
        )
        binding.bottomNav.setOnNavigationItemSelectedListener(this)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.menuHome -> {
                // ViewPager의 현재 item에 첫 번째 화면을 대입
                binding.viewpager.currentItem = 0
                return true
            }
            R.id.menuMission -> {
                // ViewPager의 현재 item에 두 번째 화면을 대입
                binding.viewpager.currentItem = 1
                return true
            }
            R.id.menuMyPage -> {
                // ViewPager의 현재 item에 세 번째 화면을 대입
                binding.viewpager.currentItem = 2
                return true
            }
            else -> {
                return false
            }
        }
    }

}