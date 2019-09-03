package com.example.travcesdriver.data.remote.travces.model.response

import com.example.travcesdriver.data.remote.travces.model.data.UpdateChildData
import com.example.travcesdriver.data.remote.travces.model.response.base.BaseResponse
import java.io.Serializable

class UpdateChildResponse (
    val data: UpdateChildData
) : BaseResponse(), Serializable