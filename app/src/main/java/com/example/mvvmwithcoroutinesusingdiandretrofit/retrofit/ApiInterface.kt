package com.example.mvvmwithcoroutinesusingdiandretrofit.retrofit

import com.example.mvvmwithcoroutinesusingdiandretrofit.models.ProductsItem
import retrofit2.http.GET

interface ApiInterface {

    @GET("products")
    suspend fun getProducts() : List<ProductsItem>
}