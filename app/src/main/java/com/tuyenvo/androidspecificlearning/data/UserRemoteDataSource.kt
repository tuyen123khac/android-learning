package com.tuyenvo.androidspecificlearning.data

import com.tuyenvo.androidspecificlearning.network.LoginRetrofitService
import javax.inject.Inject

class UserRemoteDataSource @Inject constructor(
    private val loginRetrofitService: LoginRetrofitService
) {
}