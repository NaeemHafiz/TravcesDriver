package com.example.travcesdriver.data.remote.travces.model.response

import com.example.travcesdriver.data.remote.travces.model.data.DriverData
import com.example.travcesdriver.data.remote.travces.model.response.base.BaseResponse
import java.io.Serializable

class ChildResponse(
    val data: DriverData?
) : BaseResponse(), Serializable
