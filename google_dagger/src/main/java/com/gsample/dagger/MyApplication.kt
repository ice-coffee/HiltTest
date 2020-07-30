package com.gsample.dagger

import android.app.Application

/**
 *  @author mzp
 *  date : 2020/7/24
 *  desc :
 */
class MyApplication : Application() {

    companion object {
        //AppComponent 的生命周期为应用生命周期
        val appComponent = DaggerApplicationComponent.create()
    }
}