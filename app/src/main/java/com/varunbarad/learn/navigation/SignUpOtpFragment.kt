package com.varunbarad.learn.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_sign_up_otp.*

class SignUpOtpFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up_otp, container, false)
    }

    override fun onStart() {
        super.onStart()

        buttonShowEmailError.setOnClickListener {
            // ToDo: Show error on sign-up email screen
        }
        buttonShowPasswordError.setOnClickListener {
            // ToDo: Show error on sign-up password screen
        }
        buttonOpenHome.setOnClickListener {
            // ToDo: Open home screen
        }
    }

    override fun onStop() {
        super.onStop()
        
        buttonShowEmailError.setOnClickListener(null)
        buttonShowPasswordError.setOnClickListener(null)
        buttonOpenHome.setOnClickListener(null)
    }
}