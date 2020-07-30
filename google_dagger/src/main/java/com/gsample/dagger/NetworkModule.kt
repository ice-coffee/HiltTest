package com.gsample.dagger

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 *  @author mzp
 *  date : 2020/7/27
 *  desc :
 */
@Module
class NetworkModule {
    // @Provides tell Dagger how to create instances of the type that this function
    // returns (i.e. LoginRetrofitService).
    // Function parameters are the dependencies of this type.
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
