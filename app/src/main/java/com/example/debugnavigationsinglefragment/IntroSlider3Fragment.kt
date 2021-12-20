package com.example.debugnavigationsinglefragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.debugnavigationsinglefragment.R
import com.example.debugnavigationsinglefragment.databinding.FragmentIntroSlider3Binding

class IntroSlider3Fragment : Fragment() {

    lateinit var fragmentBinding: FragmentIntroSlider3Binding
    private val URL = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_intro_slider3, container, false)

        fragmentBinding.show.setOnClickListener {
            Navigation.findNavController(fragmentBinding.root)
                .navigate(R.id.navigateFromIntroSlider3FragmentToWelcomToNameAppFragment)
        }

        fragmentBinding.group32.setOnClickListener{

//            // code for intent url for video
//            val intent = Intent(Intent.ACTION_VIEW)
//            intent.setData(Uri.parse(URL))
//            startActivity(intent)
        }

        return fragmentBinding.root


    }
}
