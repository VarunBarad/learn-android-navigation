package com.varunbarad.learn.navigation

import dagger.Component
import javax.inject.Scope

@AppScope
@Component(
    modules = [
        AppModule::class
    ]
)
interface AppComponent {
    fun inject(target: NavigationApplication)

    fun inject(target: LoginPasswordFragment)
    fun inject(target: LoginOtpFragment)
    fun inject(target: SignUpEmailFragment)
    fun inject(target: SignUpPasswordFragment)
    fun inject(target: SignUpOtpFragment)
}

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AppScope
