package com.example.travcesdriver.data.remote.travces

import com.example.travcesdriver.data.remote.base.ApiErrorResponse
import com.example.travcesdriver.data.remote.travces.model.data.LoginData


interface UserDataSource {

    interface LoginCallback {
        fun onLoginResponse(data: LoginData)
        fun onPayloadError(error: ApiErrorResponse)
    }
}