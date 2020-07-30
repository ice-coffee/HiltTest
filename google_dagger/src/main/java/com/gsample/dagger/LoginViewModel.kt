package com.gsample.dagger

import javax.inject.Inject

/**
 *  @author mzp
 *  date : 2020/7/27
 *  desc :
 */
class LoginViewModel @Inject constructor(userRepository: UserRepository){
    var userRepository: UserRepository? = null

    init {
        this.userRepository = userRepository
    }
}
