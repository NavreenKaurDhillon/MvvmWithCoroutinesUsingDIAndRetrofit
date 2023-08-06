package com.example.mvvmwithcoroutinesusingdiandretrofit

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmwithcoroutinesusingdiandretrofit.common.BaseApplication
import com.example.mvvmwithcoroutinesusingdiandretrofit.repositories.ProductVMFactory
import com.example.mvvmwithcoroutinesusingdiandretrofit.viewmodels.ProductViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var productViewModel: ProductViewModel

    @Inject
    lateinit var productVMFactory: ProductVMFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as BaseApplication).appComponent.injectInMain(this)
        productViewModel = ViewModelProvider(this, productVMFactory).get(ProductViewModel::class.java)

        productViewModel.products.observe(this, Observer {
            Log.d(TAG, "onCreate: /// "+it)
        })
    }
}