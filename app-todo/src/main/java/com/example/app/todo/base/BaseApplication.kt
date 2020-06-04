package com.example.app.todo.base

import android.app.Application
import com.example.app.todo.di.koinModules
import com.example.app.todo.ui.main.di.mainModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@BaseApplication)
            modules(listOf(
                mainModules,
                koinModules
            ))
        }
    }
}