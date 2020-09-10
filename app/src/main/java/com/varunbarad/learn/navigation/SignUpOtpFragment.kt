package com.varunbarad.learn.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_sign_up_otp.*
import javax.inject.Inject

class SignUpOtpFragment : Fragment() {
    @Inject
    lateinit var ongoingSignUpRepository: OngoingSignUpRepository

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up_otp, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        NavigationApplication.appComponent.inject(this)
    }

    override fun onStart() {
        super.onStart()

        buttonShowEmailError.setOnClickListener {
            this.ongoingSignUpRepository.updateEmailError(true)
            val action = SignUpOtpFragmentDirections.actionSignUpOtpFragmentToSignUpEmailFragment()
            findNavController().navigate(action)
        }
        buttonShowPasswordError.setOnClickListener {
            this.ongoingSignUpRepository.updatePasswordError(true)
            val action = SignUpOtpFragmentDirections.actionSignUpOtpFragmentToSignUpPasswordFragment()
            findNavController().navigate(action)
        }
        buttonOpenHome.setOnClickListener {
            HomeActivity.start(this.requireContext())
        }
    }

    override fun onStop() {
        super.onStop()
        
        buttonShowEmailError.setOnClickListener(null)
        buttonShowPasswordError.setOnClickListener(null)
        buttonOpenHome.setOnClickListener(null)
    }
}
