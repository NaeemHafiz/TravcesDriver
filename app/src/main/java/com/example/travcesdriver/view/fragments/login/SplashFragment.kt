package com.example.travcesdriver.view.fragments.login

import android.os.Bundle
import android.view.View
import com.example.travcesdriver.R
import com.example.travcesdriver.view.fragments.base.BaseFragment


class SplashFragment : BaseFragment() {
    override fun getLayoutId(): Int = R.layout.fragment_splash

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initNavigation()
    }

    private fun initNavigation() {
//        bLogin.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_splashFragment_to_loginFragment))
//        bSignUp.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_splashFragment_to_signUpFragment))
    }
}