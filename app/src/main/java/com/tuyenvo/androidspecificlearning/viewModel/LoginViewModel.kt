package com.tuyenvo.androidspecificlearning.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.tuyenvo.androidspecificlearning.di.ActivityScope
import com.tuyenvo.androidspecificlearning.repositories.UserRepository
import javax.inject.Inject

private const val TAG = "LoginViewModel"

@ActivityScope
class LoginViewModel @Inject constructor(
    private val userRepository : UserRepository
) {
    val string1 = "String 1"
}