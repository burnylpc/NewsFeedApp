package com.example.myapplication

import android.app.Application
import com.example.myapplication.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {

    //тут нужно проинициализировать коин

    override fun onCreate() {
        super.onCreate()
        //start koin
        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(appModule)
        }
    }

}