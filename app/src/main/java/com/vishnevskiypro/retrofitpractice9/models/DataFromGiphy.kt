package com.vishnevskiypro.retrofitpractice9.models

data class DataFromGiphy(
    val `data`: List<Data>,
    val meta: Meta,
    val pagination: Pagination
)