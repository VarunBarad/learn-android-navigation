package com.varunbarad.learn.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_sign_up_password.*

class SignUpPasswordFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up_password, container, false)
    }

    override fun onStart() {
        super.onStart()

        buttonOpenSignUpOtp.setOnClickListener {
            // ToDo: Open sign-up-otp screen
        }
    }

    override fun onStop() {
        super.onStop()

        buttonOpenSignUpOtp.setOnClickListener(null)
    }
}