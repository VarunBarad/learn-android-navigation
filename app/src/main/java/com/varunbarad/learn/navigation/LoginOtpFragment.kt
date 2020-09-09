package com.varunbarad.learn.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login_otp.*

class LoginOtpFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login_otp, container, false)
    }

    override fun onStart() {
        super.onStart()

        buttonShowPasswordError.setOnClickListener {
            val action = LoginOtpFragmentDirections.actionLoginOtpFragmentToLoginPasswordFragment()
            findNavController().navigate(action)
        }
        buttonOpenHome.setOnClickListener {
            // ToDo: Open home screen
        }
    }

    override fun onStop() {
        super.onStop()

        buttonShowPasswordError.setOnClickListener(null)
        buttonOpenHome.setOnClickListener(null)
    }
}
