package com.example.debugnavigationsinglefragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.debugnavigationsinglefragment.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
private lateinit var fragmentBinding:FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)

        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentBinding.signInLogin.setOnClickListener{
            Navigation.findNavController(fragmentBinding.root)
                .navigate(R.id.navigateFromLoginFragmentToHome)
        }
    }
}
