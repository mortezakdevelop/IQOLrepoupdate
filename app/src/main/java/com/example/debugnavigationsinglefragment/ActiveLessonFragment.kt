package com.example.debugnavigationsinglefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.debugnavigationsinglefragment.databinding.FragmentActiveLessonBinding


class ActiveLessonFragment : Fragment() {
    private lateinit var fragmentBinding: FragmentActiveLessonBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_active_lesson, container, false)
        // Inflate the layout for this fragment
        fragmentBinding.clActiveLesson.setOnClickListener{
            findNavController().navigate(R.id.navigateFromActiveLessonFragmentToTestFragment)
        }
        return fragmentBinding.root

    }

}