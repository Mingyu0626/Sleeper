package com.example.sleeper.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sleeper.data.BadgeData
import com.example.sleeper.data.SleepReportData
import com.example.sleeper.databinding.RowMyreportBinding
import com.example.sleeper.databinding.RowMytitleBinding

class MyReportDataAdapter (val items:ArrayList<SleepReportData>)
    : RecyclerView.Adapter<MyReportDataAdapter.ViewHolder>(){
    interface OnItemClickListener {
        fun OnItemClick(data: SleepReportData)
    }
    var itemClickListener: OnItemClickListener?= null
    inner class ViewHolder(val binding: RowMyreportBinding) : RecyclerView.ViewHolder(binding.root)
    {
        init
        {
            binding.recylerViewReport.setOnClickListener {
                itemClickListener?.OnItemClick(items[adapterPosition])
            }
        }
    }

    fun moveItem(oldPos: Int, newPos: Int) {

    }

    fun removeItem(pos: Int) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = RowMyreportBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.binding.menuName.text = items[position].name
//        holder.binding.menuPrice.text = items[position].price
//        holder.binding.menuCategoryIcon.setImageResource(items[position].imageId)
    }
}