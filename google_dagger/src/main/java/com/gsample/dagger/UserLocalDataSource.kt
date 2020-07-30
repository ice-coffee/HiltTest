package com.gsample.dagger

import android.util.Log
import javax.inject.Inject




/**
 *  @author mzp
 *  date : 2020/7/27
 *  desc :
 */
class UserLocalDataSource @Inject constructor() {
    fun loadData() {
        Log.e("dagger", "UserLocalDataSource getData")
    }

    init {
        Log.e("dagger", "UserLocalDataSource init")
    }
}