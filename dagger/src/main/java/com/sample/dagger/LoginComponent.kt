package com.sample.dagger

import dagger.Component

/**
 *  @author mzp
 *  date : 2020/7/29
 *  desc :
 */
@Component(modules = [LoginModule::class, NetworkModule::class])
interface LoginComponent {

    fun inject(loginActivity: LoginActivity)
}