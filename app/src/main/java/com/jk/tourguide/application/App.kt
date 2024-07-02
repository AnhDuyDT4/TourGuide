package com.jk.tourguide.application

import android.app.Application
import com.jk.tourguide.di.dataStoreModule
import com.jk.tourguide.di.viewModelModule
import com.jk.tourguide.di.mapperModule
import com.jk.tourguide.di.repositoryModule
import com.jk.tourguide.di.userCaseModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.core.logger.Level

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@App)
            modules(viewModelModule, mapperModule, userCaseModule, repositoryModule, dataStoreModule)
        }
    }


    override fun onTerminate() {
        super.onTerminate()
        stopKoin()
    }

    companion object {
        @Volatile
        private var instance: App? = null

        fun getInstance(): App {
            return instance ?: synchronized(this) {
                instance ?: App().also { instance = it }
            }
        }
    }
}