package com.example.debugnavigationsinglefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.debugnavigationsinglefragment.databinding.FragmentTestTwo2Binding

class TestTwoFragment : Fragment() {
    lateinit var fragmentBinding:FragmentTestTwo2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentBinding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_test_two2,container,false)
        // Inflate the layout for this fragment
        fragmentBinding.tvQuestionThreeClick.setOnClickListener{
            findNavController().navigate(R.id.navigateFromTestTwoFragmentToTestThreeFragment)
        }

        return fragmentBinding.root
    }
}