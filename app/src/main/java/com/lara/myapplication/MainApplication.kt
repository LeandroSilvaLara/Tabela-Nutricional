package com.lara.myapplication

import android.app.Application
import com.lara.myapplication.core.di.AppModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            modules(
                AppModules.uiModule,
                AppModules.domainModule,
                AppModules.dataModule
            )
        }
    }
}