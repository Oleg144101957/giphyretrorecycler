package com.vishnevskiypro.retrofitpractice9.screen

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.vishnevskiypro.retrofitpractice9.R
import com.vishnevskiypro.retrofitpractice9.databinding.GifItemBinding
import com.vishnevskiypro.retrofitpractice9.models.Data
import com.vishnevskiypro.retrofitpractice9.models.DataFromGiphy

class FirstAdapter(val context: Context) : RecyclerView.Adapter<FirstAdapter.FirstViewHolder>() {

    inner class FirstViewHolder(val binding: GifItemBinding) : RecyclerView.ViewHolder(binding.root)

    var listOfGifs = emptyList<Data>()



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder {
        return FirstViewHolder(GifItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }

    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        holder.binding.apply {
            val itemGiphy = listOfGifs[position]
            idItem.text = itemGiphy.id
            titleItem.text = itemGiphy.title

            Glide.with(context)
                .load(itemGiphy.images.downsized_small.mp4)
                .centerCrop()
                .into(imageItem)
        }
    }


    override fun getItemCount() = listOfGifs.size

    fun setList(list: List<Data>){
        listOfGifs = list
        notifyDataSetChanged()
    }
}