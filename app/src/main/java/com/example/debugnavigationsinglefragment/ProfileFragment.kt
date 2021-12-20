package com.example.debugnavigationsinglefragment

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.debugnavigationsinglefragment.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {

    lateinit var fragmentBinding:FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentBinding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_profile,container,false)

        fragmentBinding.ivBackChangeSecurityCode.setOnClickListener{
            val view = View.inflate(requireContext(),R.layout.fragment_change_security_code,null)
            val builder = AlertDialog.Builder(requireContext())
            builder.setView(view)
            val dialog = builder.create()
            dialog.show()
            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        }
        fragmentBinding.ivBackChangeProfile.setOnClickListener{
            findNavController().navigate(R.id.navigateFromProfileFragmentToChangeProfileFragment)
        }
        fragmentBinding.ivBackActionBar.setOnClickListener{
            findNavController().navigate(R.id.navigateFromProfileFragmentToActionTimeBarFragment)
        }
        fragmentBinding.ivBackSetting.setOnClickListener{
            findNavController().navigate(R.id.navigateFromProfileFragmentToSettingFragment)
        }
        return fragmentBinding.root
    }
}