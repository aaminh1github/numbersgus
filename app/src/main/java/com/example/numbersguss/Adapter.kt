package com.example.numbersguss

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row.view.*

class Adapter(val items:ArrayList<String>):RecyclerView.Adapter<Adapter.ItemViewHolder>() {
    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.row,parent,false)
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item=items[position]
        holder.itemView.apply {
            tvText.text=item
                 }
    }

    override fun getItemCount() = items.size
}