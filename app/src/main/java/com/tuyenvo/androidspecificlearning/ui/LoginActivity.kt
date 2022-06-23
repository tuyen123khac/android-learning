package com.tuyenvo.androidspecificlearning.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tuyenvo.androidspecificlearning.MyApplication
import com.tuyenvo.androidspecificlearning.R
import com.tuyenvo.androidspecificlearning.di.LoginComponent
import com.tuyenvo.androidspecificlearning.viewModel.LoginViewModel
import javax.inject.Inject

private const val TAG = "LoginActivity"
class LoginActivity : AppCompatActivity() {
    // Reference to the Login graph
    lateinit var loginComponent: LoginComponent
    // Fields that need to be injected by the login graph
    @Inject lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        // Creation of the login graph using the application graph
        loginComponent = (applicationContext as MyApplication).appComponent.loginComponent().create()
        // Make Dagger instantiate @Inject fields in LoginActivity// Make Dagger instantiate @Inject fields in LoginActivity
        loginComponent.inject(this)
        // Now loginViewModel is available
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        Log.e(TAG, "onCreate: viewModel string 1: ${loginViewModel.string1}")

        // LoginComponent is created in the activity's onCreate() method,
        // and it'll get implicitly destroyed when the activity gets destroyed.
    }
}