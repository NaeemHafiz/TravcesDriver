package com.example.travcesdriver.view.fragments.login


import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.travcesdriver.R
import com.example.travcesdriver.view.activities.base.BaseActivity
import com.example.travcesdriver.view.fragments.base.BaseFragment
import com.example.travcesdriver.viewModel.UserViewModel
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : BaseFragment() {
    override fun getLayoutId(): Int = R.layout.fragment_login
    lateinit var userViewModel: UserViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnLogin.setOnClickListener {
            //            userViewModel.login(etPhonenumber.text.toString(), etPassword.text.toString())
            moveToGlobalNavigationActivity()


        }
    }
}
