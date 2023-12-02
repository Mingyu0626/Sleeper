package com.example.sleeper.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import com.example.sleeper.data.BadgeData
import com.example.sleeper.databinding.RowMybadgeBinding

class MyBadgeDataAdapter (val items:ArrayList<BadgeData>)
    : RecyclerView.Adapter<MyBadgeDataAdapter.ViewHolder>(){
    interface OnItemClickListener {
        fun OnItemClick(data: BadgeData)
    }
    var itemClickListener: OnItemClickListener?= null
    inner class ViewHolder(val binding:RowMybadgeBinding) : RecyclerView.ViewHolder(binding.root)
    {
        init
        {
            binding.recylerViewBadge.setOnClickListener {
                itemClickListener?.OnItemClick(items[adapterPosition])
            }
        }
    }

    fun moveItem(oldPos: Int, newPos: Int) {

    }

    fun removeItem(pos: Int) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = RowMybadgeBinding.inflate(
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