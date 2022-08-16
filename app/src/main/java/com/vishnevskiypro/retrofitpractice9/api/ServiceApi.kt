package com.vishnevskiypro.retrofitpractice9.api

import com.vishnevskiypro.retrofitpractice9.models.DataFromGiphy
import retrofit2.Response
import retrofit2.http.GET


interface ServiceApi {
    @GET("/v1/gifs/trending?api_key=WWNeb31bktlpWnOvt9H5pvuk9H7BoSQ9")
    suspend fun getPicFromGiphy(): Response<DataFromGiphy>

}