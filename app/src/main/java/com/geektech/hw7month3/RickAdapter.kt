package com.geektech.hw7month3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.geektech.hw7month3.databinding.ItemRickBinding

class RickAdapter(
    val rickList: ArrayList<Rick>,
    val onClick: (position: Int) -> Unit
) : Adapter<RickAdapter.RickViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RickViewHolder {
        return RickViewHolder(
            ItemRickBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RickViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int = rickList.size

    inner class RickViewHolder(private val binding: ItemRickBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val item = rickList[adapterPosition]
            binding.apply {
                name.text = item.name
                img.setImageResource(item.img)
                aliveORNot.text = item.aliveOrNot.toString()
            }
            itemView.setOnClickListener {
                onClick(adapterPosition)
            }
        }
    }
}
