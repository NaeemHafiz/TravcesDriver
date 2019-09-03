package com.example.travcesdriver.data.remote.travces.model.response

import com.example.travcesdriver.data.remote.travces.model.data.UpdateProfileData
import com.example.travcesdriver.data.remote.travces.model.response.base.BaseResponse
import java.io.Serializable

class UpdateProfileResponse (
    val data: UpdateProfileData
    ) : BaseResponse(), Serializable
