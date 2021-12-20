package com.example.debugnavigationsinglefragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.debugnavigationsinglefragment.R
import com.example.debugnavigationsinglefragment.databinding.FragmentActiveQuestionBinding

class ActiveQuestionFragment : Fragment() {
    private lateinit var fragmentBinding: FragmentActiveQuestionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_active_question, container, false)

//        fragmentBinding.signInLogin.setOnClickListener {
//            Navigation.findNavController(fragmentBinding.root)
//                .navigate(R.id.navigateToLoginFragmentToIntroSlider3Fragment)
//        }

        return fragmentBinding.root
    }
}
