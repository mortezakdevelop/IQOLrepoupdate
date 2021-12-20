package com.example.debugnavigationsinglefragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.debugnavigationsinglefragment.R
import com.example.debugnavigationsinglefragment.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {
    private lateinit var fragmentBinding:FragmentRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_register, container, false)

        fragmentBinding.registerButton.setOnClickListener {
            Navigation.findNavController(fragmentBinding.root)
                .navigate(R.id.navigateToRegisterFragmentToRegisterInterPinFragment)
        }

        return fragmentBinding.root
    }
}
