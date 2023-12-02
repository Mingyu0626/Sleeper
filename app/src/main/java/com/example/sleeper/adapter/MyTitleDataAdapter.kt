package com.example.sleeper.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sleeper.data.TitleData
import com.example.sleeper.databinding.RowMytitleBinding

class MyTitleDataAdapter (val items:ArrayList<TitleData>)
    : RecyclerView.Adapter<MyTitleDataAdapter.ViewHolder>(){
    interface OnItemClickListener {
        fun OnItemClick(data: TitleData)
    }
    var itemClickListener: OnItemClickListener?= null
    inner class ViewHolder(val binding: RowMytitleBinding) : RecyclerView.ViewHolder(binding.root)
    {
        init
        {
            binding.recylerViewTitle.setOnClickListener {
                itemClickListener?.OnItemClick(items[adapterPosition])
            }
        }
    }

    fun moveItem(oldPos: Int, newPos: Int) {

    }

    fun removeItem(pos: Int) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = RowMytitleBinding.inflate(
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