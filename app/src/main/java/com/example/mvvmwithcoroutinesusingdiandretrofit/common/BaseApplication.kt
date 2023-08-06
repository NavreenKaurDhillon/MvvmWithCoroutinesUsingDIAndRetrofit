package com.example.mvvmwithcoroutinesusingdiandretrofit.common

import android.app.Application
import com.example.mvvmwithcoroutinesusingdiandretrofit.di.AppComponent
import com.example.mvvmwithcoroutinesusingdiandretrofit.di.DaggerAppComponent

class BaseApplication : Application() {

    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build()


    }
}