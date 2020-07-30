package com.gsample.dagger

import dagger.Component

/**
 *  @author mzp
 *  date : 2020/7/27
 *  desc :
 */
@Component(modules = [NetworkModule::class, SubcomponentsModule::class])
open interface ApplicationComponent{

    fun loginComponent(): LoginComponent.Factory

    fun inject(homeActivity: HomeActivity)
}