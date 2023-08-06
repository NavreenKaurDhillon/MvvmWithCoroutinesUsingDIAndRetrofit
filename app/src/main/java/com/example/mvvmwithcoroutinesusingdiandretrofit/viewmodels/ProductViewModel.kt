package com.example.mvvmwithcoroutinesusingdiandretrofit.viewmodels

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmwithcoroutinesusingdiandretrofit.models.ProductsItem
import com.example.mvvmwithcoroutinesusingdiandretrofit.repositories.ProductRepository
import kotlinx.coroutines.launch

class ProductViewModel(private val productRepository: ProductRepository) : ViewModel() {

    init {
        viewModelScope.launch {
            try {
                productRepository.getProducts()
            }
            catch (e : Exception)
            {
                Log.d(TAG, "//: "+e.message.toString())
            }

        }
    }
    val products : LiveData<List<ProductsItem>>
        get() = productRepository.products
}