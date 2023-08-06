package com.example.mvvmwithcoroutinesusingdiandretrofit.di

import com.example.mvvmwithcoroutinesusingdiandretrofit.MainActivity
import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    //field injection - check all fields with @inject and inject dependencies
    fun injectInMain(mainActivity: MainActivity)

}