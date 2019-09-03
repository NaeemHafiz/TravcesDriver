package com.example.travcesdriver.data.remote.travces

import com.example.travcesdriver.data.remote.travces.model.params.LoginParams
import com.example.travcesdriver.data.remote.travces.model.params.StatusParams
import com.example.travcesdriver.data.remote.travces.model.response.*
import io.reactivex.Observable
import retrofit2.http.*

interface ApiService {

    @FormUrlEncoded
    @POST("login")
    fun login(@Body body: LoginParams): Observable<LoginResponse>


    @GET("children")
    fun getChildrenList(@Query("driver_id") driver_id: String): Observable<GetChildrenResponse>

    @FormUrlEncoded
    @POST("status")
    fun pickStatus(@Body body: StatusParams): Observable<GetStatusRespons>
}
