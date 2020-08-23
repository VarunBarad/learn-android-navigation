package com.varunbarad.learn.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_phone.*

class PhoneFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_phone, container, false)
    }

    override fun onStart() {
        super.onStart()

        buttonOpenLogin.setOnClickListener {
            val action = PhoneFragmentDirections.actionPhoneFragmentToLoginPasswordFragment()
            findNavController().navigate(action)
        }
        buttonOpenSignUp.setOnClickListener {
            val action = PhoneFragmentDirections.actionPhoneFragmentToSignUpEmailFragment()
            findNavController().navigate(action)
        }
    }

    override fun onStop() {
        super.onStop()

        buttonOpenLogin.setOnClickListener(null)
        buttonOpenSignUp.setOnClickListener(null)
    }
}
