package com.example.debugnavigationsinglefragment

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.debugnavigationsinglefragment.databinding.FragmentGoogleMapBinding

class GoogleMapFragment : Fragment() {

    lateinit var fragmentBinding: FragmentGoogleMapBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.fragment_google_map, container, false)
        // Inflate the layout for this fragment
        fragmentBinding.selectSourceButton.setOnClickListener{
            val view = View.inflate(requireContext(),R.layout.popup_googlemap,null)
            val builder = AlertDialog.Builder(requireContext())
            builder.setView(view)
            val dialog = builder.create()
            dialog.show()
            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

        }
        return fragmentBinding.root

    }
}