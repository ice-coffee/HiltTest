package com.gsample.dagger

import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject


/**
 *  @author mzp
 *  date : 2020/7/27
 *  desc :
 */
class UserRemoteDataSource @Inject constructor(loginRetrofitService: LoginRetrofitService) {
    val loginRetrofitService: LoginRetrofitService

    init {
        this.loginRetrofitService = loginRetrofitService
    }

    fun loadData() {
        val call = loginRetrofitService.getHomeInfo("39.99645", "116.482022", "", 1, 20)

        // 发送网络请求（同步）
        val response: Response<ResponseBody> = call?.execute()
    }
}