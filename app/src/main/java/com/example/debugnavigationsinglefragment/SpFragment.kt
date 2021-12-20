package com.example.debugnavigationsinglefragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.debugnavigationsinglefragment.databinding.FragmentSpBinding

class SpFragment : Fragment() {
    lateinit var fragmentBinding: FragmentSpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_sp, container, false)
        return fragmentBinding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//    // Inflate the layout for this fragment

           fragmentBinding.english.setOnClickListener{
               findNavController().navigate(R.id.action_spFragment_to_viewPagerFragment)
           }
            fragmentBinding.finland.setOnClickListener {
               findNavController().navigate(R.id.action_spFragment_to_viewPagerFragment)
          }


        }

}