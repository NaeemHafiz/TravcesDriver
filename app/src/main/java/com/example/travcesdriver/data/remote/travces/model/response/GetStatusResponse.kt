package com.example.travcesdriver.data.remote.travces.model.response

import com.example.travcesdriver.data.remote.travces.model.data.GetStatusData
import com.example.travcesdriver.data.remote.travces.model.response.base.BaseResponse
import java.io.Serializable

class GetStatusRespons(
    val data: List<GetStatusData>?
) : BaseResponse(), Serializable