package com.vishnevskiypro.retrofitpractice9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.vishnevskiypro.retrofitpractice9.databinding.ActivityMainBinding
import com.vishnevskiypro.retrofitpractice9.screen.FirstAdapter
import com.vishnevskiypro.retrofitpractice9.screen.FirstViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: FirstAdapter
    private lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        Glide.with(this)
//            .load("https://media2.giphy.com/media/tXEXqNME36QO2fWOnd/giphy.gif?cid=c4afbd0d5m5la2ag6802iz3hs89sdf84lgdzf6mpeqrnkb4w&rid=giphy.gif&ct=g")
//            .centerCrop()
//            .into(binding.imageView)

        val mViewModel = ViewModelProvider(this).get(FirstViewModel::class.java)

        adapter = FirstAdapter(this)
        recycler = binding.recyclerView
        recycler.adapter = adapter

        mViewModel.getGifsVM()

        mViewModel.gifListLiveData.observe(this, { list ->
            list.body()?.let { adapter.setList(it.data) }
        })


    }
}