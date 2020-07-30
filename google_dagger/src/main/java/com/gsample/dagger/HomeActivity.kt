package com.gsample.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*
import javax.inject.Inject

/**
 *  @author mzp
 *  date : 2020/7/27
 *  desc :
 */
class HomeActivity : AppCompatActivity() {

    @Inject
    @JvmField
    var loginViewModel: LoginViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        MyApplication.appComponent.inject(this)

        btUserLogin.setOnClickListener {

            loginViewModel?.userRepository?.showTime()
        }
    }
}