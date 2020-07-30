package com.gsample.dagger

import dagger.Subcomponent

/**
 *  @author mzp
 *  date : 2020/7/27
 *  desc :
 */
@ActivityScope
@Subcomponent
interface LoginComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }

    fun inject(loginActivity: LoginActivity?)
    fun inject(userNameFragment: UserNameFragment)
    fun inject(passwordFragment: PasswordFragment)
}