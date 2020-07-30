package com.gsample.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {

    lateinit var loginComponent: LoginComponent

    @Inject
    lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

//        val networkModule = NetworkModule()
//        val localData = UserLocalDataSource()
//        val remoteData = UserRemoteDataSource(networkModule.provideLoginRetrofitService())
//        val repository = UserRepository(localData, remoteData)
//        val model = LoginViewModel(repository)

        loginComponent = MyApplication.appComponent.loginComponent().create()
        loginComponent.inject(this)

        loginViewModel.userRepository?.showTime()

        btUserLogin.setOnClickListener {

            val ft: FragmentTransaction = supportFragmentManager.beginTransaction()
            ft.add(
                R.id.llLoginFragment,
                UserNameFragment()
            )
            ft.commit()
        }
        btPasswordLogin.setOnClickListener {

            val ft: FragmentTransaction = supportFragmentManager.beginTransaction()
            ft.add(
                R.id.llLoginFragment,
                PasswordFragment()
            )
            ft.commit()
        }
    }
}