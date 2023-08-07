package com.example.mvvmwithcoroutinesusingdiandretrofit.models

data class ProductsItem(
    val category: String,
    val description: String,
    val id: Int,
    val image: String,
    val price: Double,
    val title: String
)