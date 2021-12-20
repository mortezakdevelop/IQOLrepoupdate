package com.example.debugnavigationsinglefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.debugnavigationsinglefragment.databinding.FragmentTestFourBinding


class TestFourFragment : Fragment() {
lateinit var fragmentBinding:FragmentTestFourBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentBinding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_test_four,container,false)
        // Inflate the layout for this f
        fragmentBinding.tvQuestionFiveClick.setOnClickListener{
            findNavController().navigate(R.id.navigateeFromTestFourFragmentToTestFiveFragment)
        }
        return fragmentBinding.root
    }

}
