package com.example.travcesdriver.repository

import android.annotation.SuppressLint
import android.app.Application
import com.example.travcesdriver.data.remote.travces.TravcesRetroFitClientInstance
import com.example.travcesdriver.data.remote.travces.UserDataSource
import com.example.travcesdriver.data.remote.travces.model.params.LoginParams
import com.mtech.travces.utils.ErrorUtils
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class UserRepository(var context: Application) {


    fun getApiService() = TravcesRetroFitClientInstance.getInstance(context)!!.getService()

    @SuppressLint("CheckResult")
    fun login(phone: String, password: String, callback: UserDataSource.LoginCallback) {
        val params = LoginParams()
        params.phone = phone
        params.password = password

        getApiService().login(params)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ callback.onLoginResponse(it.data) }
                , {
                    callback.onPayloadError(ErrorUtils.parseError(it))
                })
    }
//    @SuppressLint("CheckResult")
//    fun getDriverList(parentId: String, callback: UserDataSource.getDriverListCallback) {
//        getApiService().getDriverList(parentId).subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe({ callback.ongetDriverListResponse(it) }
//                , {
//                    callback.onPayloadError(ErrorUtils.parseError(it))
//                })
//    }
}
