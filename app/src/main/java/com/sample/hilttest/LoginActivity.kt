package com.sample.hilttest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 *  @author mzp
 *  date : 2020/7/29
 *  desc :
 */
class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val networkModule = NetworkModule()
        val localData = UserLocalDataSource()
        val remoteData = UserRemoteDataSource(networkModule.provideLoginRetrofitService())
        val repository = UserRepository(localData, remoteData)
        val model = LoginViewModel(repository)

        model.userRepository?.userRemoteDataSource?.loadData()
    }
}