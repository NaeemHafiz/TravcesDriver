package com.example.travcesdriver.data.remote.travces.model.response

import com.example.travcesdriver.data.remote.travces.model.data.LoginData
import com.example.travcesdriver.data.remote.travces.model.response.base.BaseResponse
import java.io.Serializable

class LoginResponse(
    val data: LoginData
) : BaseResponse(), Serializable