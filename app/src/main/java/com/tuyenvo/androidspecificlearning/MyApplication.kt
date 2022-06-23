package com.tuyenvo.androidspecificlearning

import android.app.Application
import com.tuyenvo.androidspecificlearning.di.DaggerAppComponent

class MyApplication : Application() {
    val appComponent = DaggerAppComponent.create()
}