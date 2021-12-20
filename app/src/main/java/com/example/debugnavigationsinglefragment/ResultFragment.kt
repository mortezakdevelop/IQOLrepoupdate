package com.example.debugnavigationsinglefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.debugnavigationsinglefragment.databinding.FragmentResultBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class ResultFragment : Fragment() {
    lateinit var fragmentBinding:FragmentResultBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_result,container,false)
        // Inflate the layout for this fragment

        fragmentBinding.serviceButton.setOnClickListener{
            findNavController().navigate(R.id.navigateFromResultFragmentToServiceFragment)
        }
        fragmentBinding.doctorsNearlyButton.setOnClickListener{
            findNavController().navigate(R.id.navigateFromResultFragmentToGoogleMapFragment)
        }
        return fragmentBinding.root
    }
}