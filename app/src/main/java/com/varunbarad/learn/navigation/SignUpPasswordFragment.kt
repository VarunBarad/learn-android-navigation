package com.varunbarad.learn.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_sign_up_password.*
import javax.inject.Inject

class SignUpPasswordFragment : Fragment() {
    @Inject
    lateinit var ongoingSignUpRepository: OngoingSignUpRepository

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up_password, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        NavigationApplication.appComponent.inject(this)
    }

    override fun onStart() {
        super.onStart()

        if (this.ongoingSignUpRepository.currentEntry().passwordError) {
            textMessage.visibility = View.VISIBLE
            this.ongoingSignUpRepository.updatePasswordError(false)
        } else {
            textMessage.visibility = View.GONE
        }

        buttonOpenSignUpOtp.setOnClickListener {
            val action = SignUpPasswordFragmentDirections.actionSignUpPasswordFragmentToSignUpOtpFragment()
            findNavController().navigate(action)
        }
    }

    override fun onStop() {
        super.onStop()

        buttonOpenSignUpOtp.setOnClickListener(null)
    }
}
