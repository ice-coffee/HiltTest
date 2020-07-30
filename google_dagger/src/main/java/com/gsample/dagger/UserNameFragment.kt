package com.gsample.dagger

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import javax.inject.Inject

/**
 *  @author mzp
 *  date : 2020/7/28
 *  desc :
 */
class UserNameFragment : Fragment() {

    @Inject
    lateinit var loginViewModel: LoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_user_name, null)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        (activity as LoginActivity).loginComponent.inject(this)
    }

    override fun onResume() {
        super.onResume()
        loginViewModel.userRepository?.showTime()
    }
}