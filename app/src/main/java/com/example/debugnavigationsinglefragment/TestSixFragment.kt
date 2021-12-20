package com.example.debugnavigationsinglefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.debugnavigationsinglefragment.databinding.FragmentTestTwoBinding

class TestSixFragment : Fragment() {
    lateinit var fragmentBinding:FragmentTestTwoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentBinding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_test_two,container,false)
        // Inflate the layout for this fragmen
        fragmentBinding.tvEnd.setOnClickListener{
            findNavController().navigate(R.id.navigateFromTestSixFragmentToResultFragment)
        }

        return fragmentBinding.root
    }
}