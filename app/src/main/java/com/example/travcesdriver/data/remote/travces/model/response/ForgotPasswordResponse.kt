package com.example.travcesdriver.data.remote.travces.model.response

import com.example.travcesdriver.data.remote.travces.model.data.ForgotPasswordData
import com.example.travcesdriver.data.remote.travces.model.response.base.BaseResponse
import java.io.Serializable

class ForgotPasswordResponse(
    val data: ForgotPasswordData
) : BaseResponse(), Serializable