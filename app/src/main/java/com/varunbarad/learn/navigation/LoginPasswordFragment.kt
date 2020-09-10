package com.varunbarad.learn.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login_password.*
import javax.inject.Inject

class LoginPasswordFragment : Fragment() {
    @Inject
    lateinit var ongoingLoginRepository: OngoingLoginRepository

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login_password, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        NavigationApplication.appComponent.inject(this)
    }

    override fun onStart() {
        super.onStart()

        if (this.ongoingLoginRepository.currentEntry().passwordError) {
            textMessage.visibility = View.VISIBLE
            this.ongoingLoginRepository.updatePasswordError(false)
        } else {
            textMessage.visibility = View.GONE
        }

        buttonOpenLoginOtp.setOnClickListener {
            val action = LoginPasswordFragmentDirections.actionLoginPasswordFragmentToLoginOtpFragment()
            findNavController().navigate(action)
        }
    }

    override fun onStop() {
        super.onStop()

        buttonOpenLoginOtp.setOnClickListener(null)
    }
}
