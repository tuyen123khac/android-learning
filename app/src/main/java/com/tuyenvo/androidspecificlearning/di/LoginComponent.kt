package com.tuyenvo.androidspecificlearning.di

import com.tuyenvo.androidspecificlearning.ui.LoginActivity
import dagger.Component
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface LoginComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create() : LoginComponent
    }

    fun inject(activity: LoginActivity)

//    fun inject(usernameFragment: LoginUsernameFragment)
//    fun inject(passwordFragment: LoginPasswordFragment)
    // For Login activity and Fragments, they use the same LoginComponent (fragment refer from activity)
    // And with the same scope @ActivityScope, it always provide the same instance of LoginViewModel
    // which also scope @ActivityScope
}