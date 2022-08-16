package com.vishnevskiypro.retrofitpractice9.models

data class Pagination(
    val count: Int,
    val offset: Int,
    val total_count: Int
)