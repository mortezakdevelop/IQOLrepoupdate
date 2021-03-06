package com.example.debugnavigationsinglefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.debugnavigationsinglefragment.databinding.FragmentWelcomeToNameAppBinding

class WelcomeToNameAppFragment : Fragment() {

    private lateinit var binding: FragmentWelcomeToNameAppBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {
        binding = FragmentWelcomeToNameAppBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        binding.registerNow.setOnClickListener{
//            findNavController().navigate(R.id.navigatetoWelcomeToNameAppToRegisterFragment)
//        }
        binding.signIn.setOnClickListener{
            findNavController().navigate(R.id.action_viewPagerFragment_to_loginFragment)
        }
        binding.registerNow.setOnClickListener{
            findNavController().navigate(R.id.action_viewPagerFragment_to_registerFragment)
        }


    }
}




