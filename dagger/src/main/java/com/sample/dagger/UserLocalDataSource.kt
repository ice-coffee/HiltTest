package com.sample.dagger

import android.util.Log
import dagger.Provides
import javax.inject.Inject

/**
 *  @author mzp
 *  date : 2020/7/29
 *  desc :
 */
class UserLocalDataSource @Inject constructor() {

    fun loadData() {
        Log.e("dagger", "UserLocalDataSource getData")
    }
}
