package com.example.travcesdriver.data.remote.travces.model.response

import com.example.travcesdriver.data.remote.travces.model.data.UpdatePasswordData
import com.example.travcesdriver.data.remote.travces.model.response.base.BaseResponse
import java.io.Serializable

class UpdatePasswordResponse(
    val data: UpdatePasswordData
) : BaseResponse(), Serializable