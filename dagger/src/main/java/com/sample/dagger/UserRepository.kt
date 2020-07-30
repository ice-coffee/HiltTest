package com.sample.dagger

import android.util.Log
import javax.inject.Inject

/**
 *  @author mzp
 *  date : 2020/7/29
 *  desc :
 */
class UserRepository @Inject constructor (userLocalDataSource: UserLocalDataSource,
                      userRemoteDataSource: UserRemoteDataSource
) {
    val userLocalDataSource: UserLocalDataSource
    val userRemoteDataSource: UserRemoteDataSource
    val time: Long

    init {
        this.userLocalDataSource = userLocalDataSource
        this.userRemoteDataSource = userRemoteDataSource
        this.time = System.currentTimeMillis()
    }

    fun showTime() {
        Log.e("dagger", "$time")
    }
}