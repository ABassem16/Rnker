package com.example.rnker.SignIn

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class LoginViewModel {
    private val prvUsername=MutableLiveData<String>()
    val username:LiveData<String>
        get() = prvUsername

    private val prvEmail=MutableLiveData<String>()
    val email:LiveData<String>
        get() = prvEmail

    private val prvPassword=MutableLiveData<String>()
    val password:LiveData<String>
        get() = prvPassword

    private val specialChars="[*.! @#\$%^&(){}[\\]:;<>,.?\\/~_+-=|]"

    private fun isEmailValid(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    private fun isPasswordValid(password: String): Boolean
    {
        return password.length<8
    }

}