package com.varunbarad.learn.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_login_password.*

class LoginPasswordFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login_password, container, false)
    }

    override fun onStart() {
        super.onStart()

        buttonOpenLoginOtp.setOnClickListener {
            // ToDo: Open login-otp screen
        }
    }

    override fun onStop() {
        super.onStop()

        buttonOpenLoginOtp.setOnClickListener(null)
    }
}