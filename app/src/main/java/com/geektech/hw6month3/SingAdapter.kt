package com.geektech.hw6month3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.geektech.hw6month3.databinding.ItemSongBinding

class SingAdapter(
    val songList: ArrayList<Song>,
    val onClick: (position: Int) -> Unit
) : Adapter<SingAdapter.SingViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SingViewHolder {
        return SingViewHolder(
            ItemSongBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: SingViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int = songList.size

    inner class SingViewHolder(private val binding: ItemSongBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val item = songList[adapterPosition]
            binding.apply {
                numer.text = item.numberofsong
                nameofsong.text = item.nameofsong
                singer.text = item.nameofsinger
                timeofsong.text = item.timeofsong
            }
itemView.setOnClickListener{
    onClick(adapterPosition)
}
        }
    }
}
