package com.tuyenvo.androidspecificlearning.di.modules

import com.tuyenvo.androidspecificlearning.network.LoginRetrofitService
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class NetworkModule {
    @Singleton
    @Provides
    fun provideLoginRetrofitService(okHttpClient: OkHttpClient): LoginRetrofitService {
        return Retrofit.Builder()
            .baseUrl("https://tuyenvo.com")
            .build()
            .create(LoginRetrofitService::class.java)
    }

    @Singleton
    @Provides
    fun provideOkhttp() : OkHttpClient {
        return OkHttpClient.Builder().build()
    }
}