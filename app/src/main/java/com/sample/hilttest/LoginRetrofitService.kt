package com.sample.hilttest

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST


/**
 *  @author mzp
 *  date : 2020/7/27
 *  desc :
 */
interface LoginRetrofitService {

    @POST("room/index")
    @FormUrlEncoded
    fun getHomeInfo(
        @Field("latitude") latitude: String?,
        @Field("longtitude") longtitude: String?,
        @Field("keywords") keywords: String?,
        @Field("limit") limit: Int,
        @Field("page") page: Int
    ): Call<ResponseBody>
}