package com.example.travcesdriver.viewModel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.example.travcesdriver.data.remote.base.ApiErrorResponse
import com.example.travcesdriver.data.remote.travces.UserDataSource
import com.example.travcesdriver.data.remote.travces.model.data.LoginData
import com.example.travcesdriver.repository.UserRepository
import com.example.travcesdriver.utils.extensions.OneShotEvent
import com.mtech.travces.utils.extensions.ERROR_CODE_EMPTY_PASSWORD
import com.mtech.travces.utils.extensions.ERROR_CODE_EMPTY_PHONE_FIELD

class UserViewModel(context: Application) : BaseAndroidViewModel(context) {

    var loginResponse: MutableLiveData<OneShotEvent<LoginData>> = MutableLiveData()

    var userRepository: UserRepository = UserRepository(context)

    fun login(phone: String, password: String) {
        showProgressBar(true)
        var canProceed = true
        if (phone.isEmpty()) {
            handleErrorType(ERROR_CODE_EMPTY_PHONE_FIELD, "Enter Phone Number")
            canProceed = false
        }
        if (password.isEmpty()) {
            handleErrorType(ERROR_CODE_EMPTY_PASSWORD, "Enter Password")
            canProceed = false
        }
//        if (phone.length < 10 || phone.length > 13 || phone.matches(regexStr.toRegex()) == false) {
//            handleErrorType(ERROR_CODE_WRONG_NUMBER_FORMAT, "Enter Correct Format")
//            canProceed = false
//        }

        if (!canProceed) return
        userRepository.login(phone, password, object : UserDataSource.LoginCallback {
            override fun onLoginResponse(data: LoginData) {
                showProgressBar(false)
                loginResponse.value = OneShotEvent(data)
            }

            override fun onPayloadError(error: ApiErrorResponse) {
                showProgressBar(false)
                showSnackbarMessage(error.message)
            }
        })
    }

}