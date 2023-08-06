package com.example.mvvmwithcoroutinesusingdiandretrofit.repositories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmwithcoroutinesusingdiandretrofit.viewmodels.ProductViewModel
import javax.inject.Inject

class ProductVMFactory @Inject constructor(private val productRepository: ProductRepository) : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ProductViewModel(productRepository) as T
    }
}