package com.example.mvvmwithcoroutinesusingdiandretrofit.repositories

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mvvmwithcoroutinesusingdiandretrofit.models.ProductsItem
import com.example.mvvmwithcoroutinesusingdiandretrofit.retrofit.ApiInterface
import javax.inject.Inject

class ProductRepository @Inject constructor(private val apiInterface: ApiInterface) {

    private val productsMLD = MutableLiveData<List<ProductsItem>>()
    val products : LiveData<List<ProductsItem>>
        get() = productsMLD

    suspend fun getProducts(){
        val result = apiInterface.getProducts()
        if (result!=null){
            Log.d(TAG, "getProducts: // products list = "+result)
            productsMLD.postValue(result)
        }
    }
}