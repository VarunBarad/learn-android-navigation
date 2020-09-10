package com.varunbarad.learn.navigation

import android.app.Application
import dagger.Module
import dagger.Provides

@Module(
    includes = []
)
class AppModule(private val applicationContext: Application) {
    @Provides
    fun applicationContext(): Application {
        return applicationContext
    }

    @Provides
    @AppScope
    fun ongoingLoginRepository(): OngoingLoginRepository {
        return OngoingLoginRepository()
    }

    @Provides
    @AppScope
    fun ongoingSignUpRepository(): OngoingSignUpRepository {
        return OngoingSignUpRepository()
    }
}
