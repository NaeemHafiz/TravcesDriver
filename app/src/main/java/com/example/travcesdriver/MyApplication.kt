package com.example.travcesdriver

import android.content.Context
import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication
import com.example.travcesdriver.data.sharedPreferences.AppPreferences
import com.example.travcesdriver.utils.application.MyContextWrapper
import java.util.*

class MyApplication : MultiDexApplication() {

    override fun attachBaseContext(newBase: Context?) {
        val newLocale = Locale(AppPreferences(newBase!!).getLocale())
        val context = MyContextWrapper.wrapApplication(newBase, newLocale)
        super.attachBaseContext(context)
        MultiDex.install(this)
    }

    init {
        instance = this
    }

    companion object {
        @JvmStatic
        val TAG: String = MyApplication::class.java.simpleName

        var instance = MyApplication()
    }
}