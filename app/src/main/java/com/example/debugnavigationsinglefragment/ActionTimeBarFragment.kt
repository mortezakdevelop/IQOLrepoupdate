package com.example.debugnavigationsinglefragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.debugnavigationsinglefragment.R
import com.example.debugnavigationsinglefragment.databinding.FragmentActionBarTimeBinding

class ActionTimeBarFragment : Fragment() {
private lateinit var fragmentBinding:FragmentActionBarTimeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_action_bar_time, container, false)

        // Inflate the layout for this fragment
        return fragmentBinding.root
    }
}
