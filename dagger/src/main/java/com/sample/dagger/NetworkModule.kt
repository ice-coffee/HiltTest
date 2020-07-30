package com.sample.dagger

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 *  @author mzp
 *  date : 2020/7/29
 *  desc :
 */
@Module
class NetworkModule {

    @Provides
    fun provideLoginRetrofitService(): LoginRetrofitService {
        // Whenever Dagger needs to provide an instance of type LoginRetrofitService,
        // this code (the one inside the @Provides method) is run.
        return Retrofit.Builder()
            .baseUrl("http://smileback.xiaogang.org.cn/")
            .build()
            .create(LoginRetrofitService::class.java)
    }
}