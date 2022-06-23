package com.tuyenvo.androidspecificlearning.repositories

import com.tuyenvo.androidspecificlearning.data.UserLocalDataSource
import com.tuyenvo.androidspecificlearning.data.UserRemoteDataSource
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(
    private val localDataSource: UserLocalDataSource,
    private val remoteDataSource: UserRemoteDataSource
) {
}