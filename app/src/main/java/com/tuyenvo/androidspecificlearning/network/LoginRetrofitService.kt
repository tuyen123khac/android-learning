package com.tuyenvo.androidspecificlearning.network

import com.tuyenvo.androidspecificlearning.models.Repo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface LoginRetrofitService {
    @GET("users/{user}/repos")
    fun listRepos(@Path("user") user: String) : Call<List<Repo>>
}