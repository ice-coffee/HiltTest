package com.sample.dagger

import dagger.Module
import dagger.Provides
import javax.inject.Inject

/**
 *  @author mzp
 *  date : 2020/7/29
 *  desc :
 */
@Module
class LoginModule @Inject constructor (userRepository: UserRepository){
    var userRepository: UserRepository? = null

    init {
        this.userRepository = userRepository
    }
}
