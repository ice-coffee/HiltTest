package com.sample.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

/**
 *  @author mzp
 *  date : 2020/7/29
 *  desc :
 */
class LoginActivity : AppCompatActivity() {

    @Inject
    lateinit var userLocalDataSource: UserLocalDataSource

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        DaggerLoginComponent.create().inject(this)

        userLocalDataSource.loadData()
    }
}