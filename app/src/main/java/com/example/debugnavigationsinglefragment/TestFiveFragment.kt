package com.example.debugnavigationsinglefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.debugnavigationsinglefragment.databinding.FragmentTestFiveBinding

class TestFiveFragment : Fragment() {
    lateinit var fragmentBinding:FragmentTestFiveBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentBinding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_test_five,container,false)
        // Inflate the layout for this fragmen
        fragmentBinding.tvQuestionSixClick.setOnClickListener{
            findNavController().navigate(R.id.navigateFromTestFiveFragmentToTestSixFragment)
        }
        return fragmentBinding.root
    }
}