package com.tuyenvo.androidspecificlearning.di

import com.tuyenvo.androidspecificlearning.di.modules.NetworkModule
import com.tuyenvo.androidspecificlearning.di.modules.SubcomponentModule
import com.tuyenvo.androidspecificlearning.ui.LoginActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, SubcomponentModule::class])
interface AppComponent {
    fun loginComponent() : LoginComponent.Factory
}