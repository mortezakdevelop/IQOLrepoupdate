package com.example.debugnavigationsinglefragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.debugnavigationsinglefragment.R
import com.example.debugnavigationsinglefragment.databinding.FragmentRegisterInterPinBinding

class RegisterInterPinFragment : Fragment() {
private lateinit var fragmentBinding:FragmentRegisterInterPinBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_register_inter_pin, container, false)

        fragmentBinding.tvContinue.setOnClickListener {
            Navigation.findNavController(fragmentBinding.root)
                .navigate(R.id.navigateFromRegisterPinFragmentToTestFragment)
        }

        return fragmentBinding.root    }
}
