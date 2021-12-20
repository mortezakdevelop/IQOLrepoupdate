package com.example.debugnavigationsinglefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.debugnavigationsinglefragment.databinding.FragmentViewPagerBinding


class ViewPagerFragment : Fragment() {

    private lateinit var binding: FragmentViewPagerBinding
    private lateinit var adapter: ScreenSlidePagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentViewPagerBinding.inflate(inflater, container, false)
        binding.pager.setOnClickListener{

        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = ScreenSlidePagerAdapter(requireActivity())
        adapter.addFrag(IntroSlider0Fragment())
        adapter.addFrag(IntroSlider3Fragment())
        adapter.addFrag(WelcomeToNameAppFragment())
        binding.pager.adapter = adapter

    }
}




