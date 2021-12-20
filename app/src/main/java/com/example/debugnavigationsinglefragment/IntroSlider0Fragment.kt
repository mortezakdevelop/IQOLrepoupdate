package com.example.debugnavigationsinglefragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.debugnavigationsinglefragment.R
import com.example.debugnavigationsinglefragment.databinding.FragmentIntroSlider0Binding

class IntroSlider0Fragment : Fragment() {
    lateinit var fragmentBinding: FragmentIntroSlider0Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_intro_slider0,container,false)

        fragmentBinding.skipped.setOnClickListener{
            findNavController().navigate(R.id.homeFragment)
        }
        fragmentBinding.group32.setOnClickListener{
            findNavController().navigate(R.id.introSlider3Fragment)
        }
        return fragmentBinding.root


    }

}
