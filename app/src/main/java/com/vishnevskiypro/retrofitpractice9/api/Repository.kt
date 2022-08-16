package com.vishnevskiypro.retrofitpractice9.api

import com.vishnevskiypro.retrofitpractice9.models.DataFromGiphy
import retrofit2.Response

class Repository {

    suspend fun getPicFromRepo(): Response<DataFromGiphy> {
        return RetrofitInstance.api.getPicFromGiphy()
    }
}