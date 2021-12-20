package com.example.debugnavigationsinglefragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import com.example.debugnavigationsinglefragment.R
import com.example.debugnavigationsinglefragment.databinding.FragmentHomeBinding
import com.example.debugnavigationsinglefragment.databinding.FragmentLoginBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeFragment : Fragment() {
    private lateinit var fragmentBinding:FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fragmentBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        fragmentBinding.tvViewActiveLesson.setOnClickListener{
            Navigation.findNavController(fragmentBinding.root).navigate(R.id.navigateFromHomeFragmentToActiveLessonFragment)
        }
        fragmentBinding.tvViewActionquestion.setOnClickListener{
            Navigation.findNavController(fragmentBinding.root).navigate(R.id.navigateFromHomeFragmentToActiveQuestionFragment)
        }


        return fragmentBinding.root

        }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


//        val bottomNav =
//            requireActivity().findViewById<BottomNavigationView>(R.id.bottom_navigation)
//        bottomNav.visibility = View.VISIBLE

//        requireActivity().onBackPressedDispatcher.addCallback(
//            requireActivity(),
//            object : OnBackPressedCallback(true) {
//                override fun handleOnBackPressed() {
//                    if (bottomNav.selectedItemId == R.id.home) {
//                        requireActivity().finish()
//                    } else {
//                        isEnabled = false
//                        requireActivity().onBackPressed()
//                    }
//                }
//            })
//        bottomNav.setOnItemSelectedListener {
//            when (it.itemId){
//                R.id.home ->{
//                    findNavController().navigate(R.id.homeFragment)
//                    return@setOnItemSelectedListener true
//                }
//                R.id.service ->{
//                    findNavController().navigate(R.id.serviceFragment)
//                    return@setOnItemSelectedListener true
//                }
//                R.id.report ->{
//                    findNavController().navigate(R.id.reportFragment)
//                    return@setOnItemSelectedListener true
//                }
//                R.id.profile ->{
//                    findNavController().navigate(R.id.profileFragment)
//                    return@setOnItemSelectedListener true
//                }
//
//                else -> return@setOnItemSelectedListener true
//            }
//        }


    }
}



    //// use custom view bottom navigation ali code

    //        homeFragment.bottomNavigationViewId.apply {
//            setContent(
//                listOf(
//                    BottomNavigation.Item(
//                        R.drawable.ic_user_black,
//                        name = "user"
//                    ) {
//                        Toast.makeText(this@HomeActivity, "user", Toast.LENGTH_SHORT).show()
//                        true
//                    },
//                    BottomNavigation.Item(R.drawable.ic_shopping_black, "shopping") { true },
//                    BottomNavigation.Item(R.drawable.ic_category_black, "category") { true },
//                    BottomNavigation.Item(R.drawable.home_black, "home") { true },
//                )
//            )
//            selectable = true
//            selectedItem = 2
//
//        }















//package com.example.debugnavigationsinglefragment
//
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.databinding.DataBindingUtil
//import androidx.fragment.app.Fragment
//import androidx.navigation.Navigation
//import com.example.debugnavigationsinglefragment.R
//import com.example.debugnavigationsinglefragment.databinding.FragmentHomeBinding
//import com.example.debugnavigationsinglefragment.databinding.FragmentLoginBinding
//
//class HomeFragment : Fragment() {
//    private lateinit var fragmentBinding: FragmentHomeBinding
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        fragmentBinding =
//            DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
//
//        fragmentBinding.tvViewActionquestion.setOnClickListener {
//            Navigation.findNavController(fragmentBinding.root)
//                .navigate(R.id.navigateToHomeFragmentToActiveQuestionFragment)
//        }
//        fragmentBinding.tvViewActiveLesson.setOnClickListener {
//            Navigation.findNavController(fragmentBinding.root)
//                .navigate(R.id.navigateToHomeFragmentToActiveQuestionFragment)
//        }
//
//        fragmentBinding.cardViewHome.setOnClickListener{
//            Navigation.findNavController(fragmentBinding.root).navigate(R.id.navigateToHomeFragmentToServiceFragment)
//        }
//        return fragmentBinding.root
//    }
//}
