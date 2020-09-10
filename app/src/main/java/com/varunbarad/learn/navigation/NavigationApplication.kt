package com.varunbarad.learn.navigation

import android.app.Application

class NavigationApplication : Application() {
    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()

        appComponent = this.buildDaggerGraph()
        appComponent.inject(this)
    }

    private fun buildDaggerGraph(): AppComponent {
        return DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }
}
