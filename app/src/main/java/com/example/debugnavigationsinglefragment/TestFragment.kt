package com.example.debugnavigationsinglefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.debugnavigationsinglefragment.R
import com.example.debugnavigationsinglefragment.databinding.FragmentTestBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class TestFragment : Fragment() {
lateinit var fragmentbinding: FragmentTestBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentbinding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_test,container,false)
        // Inflate the layout for this fragment

        fragmentbinding.tvQuestionTwoClick.setOnClickListener{
            findNavController().navigate(R.id.navigateFromTestFragmentToTestTwoFragment)
        }
        return fragmentbinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


       /* val bottomNav =
            requireActivity().findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNav.visibility = View.INVISIBLE
*/
            }
        }




