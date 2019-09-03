package com.example.travcesdriver.data.remote.travces.model.response

import com.example.travcesdriver.data.remote.travces.model.data.GetChildrenData
import com.example.travcesdriver.data.remote.travces.model.response.base.BaseResponse
import java.io.Serializable

class GetChildrenResponse(
    val data: List<GetChildrenData>?
) : BaseResponse(), Serializable