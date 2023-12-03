package com.example.sleeper.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Spinner
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sleeper.R
import com.example.sleeper.activity.MyBadgeActivity
import com.example.sleeper.activity.MyTitleActivity
import com.example.sleeper.adapter.MyReportDataAdapter
import com.example.sleeper.adapter.MyTitleDataAdapter
import com.example.sleeper.data.SleepReportData
import com.example.sleeper.data.TitleData
import com.example.sleeper.databinding.FragmentMyPageBinding

class MyPageFragment : Fragment() {
    lateinit var binding: FragmentMyPageBinding
    val data:ArrayList<SleepReportData> = ArrayList()
    lateinit var adapter: MyReportDataAdapter

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

        initRecyclerView()
        initData()
    }

    private fun initData() {

    }

    private fun initRecyclerView() {
        binding.recyclerViewMyReport.layoutManager = LinearLayoutManager(
            requireContext(), LinearLayoutManager.VERTICAL, false
        )
        adapter = MyReportDataAdapter(data)
        binding.recyclerViewMyReport.adapter = adapter
    }

}