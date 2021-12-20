package com.example.debugnavigationsinglefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.debugnavigationsinglefragment.databinding.FragmentTestThreeBinding


class TestThreeFragment : Fragment() {
 lateinit var fragmentBinding:FragmentTestThreeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentBinding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_test_three,container,false)
        // Inflate the layout for this fragment
        fragmentBinding.tvQuestionFourClick.setOnClickListener{
            findNavController().navigate(R.id.navigateFromTestThreeFragmentToTestFourFragment)
        }
        return fragmentBinding.root
    }
}