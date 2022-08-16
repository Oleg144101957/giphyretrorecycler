package com.vishnevskiypro.retrofitpractice9.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    val api = Retrofit.Builder()
        .baseUrl("https://api.giphy.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ServiceApi::class.java)
}