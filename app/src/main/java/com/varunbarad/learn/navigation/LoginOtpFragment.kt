package com.varunbarad.learn.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login_otp.*
import javax.inject.Inject

class LoginOtpFragment : Fragment() {
    @Inject
    lateinit var ongoingLoginRepository: OngoingLoginRepository

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login_otp, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        NavigationApplication.appComponent.inject(this)
    }

    override fun onStart() {
        super.onStart()

        buttonShowPasswordError.setOnClickListener {
            this.ongoingLoginRepository.updatePasswordError(true)
            val action = LoginOtpFragmentDirections.actionLoginOtpFragmentToLoginPasswordFragment()
            findNavController().navigate(action)
        }
        buttonOpenHome.setOnClickListener {
            HomeActivity.start(this.requireContext())
        }
    }

    override fun onStop() {
        super.onStop()

        buttonShowPasswordError.setOnClickListener(null)
        buttonOpenHome.setOnClickListener(null)
    }
}
