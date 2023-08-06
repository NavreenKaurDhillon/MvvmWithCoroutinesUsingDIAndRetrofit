package com.example.mvvmwithcoroutinesusingdiandretrofit.di

import com.example.mvvmwithcoroutinesusingdiandretrofit.retrofit.ApiInterface
import com.example.mvvmwithcoroutinesusingdiandretrofit.utils.Constants
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun getRetrofitInstance() : Retrofit{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun getApiInterface(retrofit: Retrofit) : ApiInterface{
       return retrofit.create(ApiInterface::class.java)
    }
}