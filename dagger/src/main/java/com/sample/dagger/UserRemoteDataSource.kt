package com.sample.dagger

import android.util.Log
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject

/**
 *  @author mzp
 *  date : 2020/7/29
 *  desc :
 */
class UserRemoteDataSource @Inject constructor (loginRetrofitService: LoginRetrofitService) {
    val loginRetrofitService: LoginRetrofitService

    init {
        this.loginRetrofitService = loginRetrofitService
    }

    fun loadData() {
        Log.e("dagger", "UserLocalDataSource getData")

        val call = loginRetrofitService.getHomeInfo("39.99645", "116.482022", "", 1, 20)

        // 发送网络请求（同步）
        val response: Response<ResponseBody> = call?.execute()
    }
}