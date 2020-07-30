package com.sample.hilttest

/**
 *  @author mzp
 *  date : 2020/7/29
 *  desc :
 */
class LoginViewModel (userRepository: UserRepository){
    var userRepository: UserRepository? = null

    init {
        this.userRepository = userRepository
    }
}
