package com.example.debugnavigationsinglefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.debugnavigationsinglefragment.databinding.FragmentGoogleMapBinding
import com.example.debugnavigationsinglefragment.databinding.PopupGooglemapBinding

class GoogleMapPopUp : Fragment() {

    lateinit var fragmentBinding:PopupGooglemapBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.popup_googlemap, container, false)
        // Inflate the layout for this fragment
        return fragmentBinding.root

    }
}