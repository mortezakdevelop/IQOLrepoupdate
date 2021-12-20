package com.example.debugnavigationsinglefragment

import ServiceTopItemsAdapter
import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.debugnavigationsinglefragment.databinding.FragmentActiveLessonBinding
import com.example.debugnavigationsinglefragment.databinding.FragmentServiceBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class ServiceFragment : Fragment() {
    private lateinit var fragmentBinding: FragmentServiceBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_service, container, false)
        // Inflate the layout for this fragment


        // alert dialog setup
        fragmentBinding.detailServiceOne.setOnClickListener{
            val view = View.inflate(requireContext(),R.layout.alertdialog_service,null)
            val builder = AlertDialog.Builder(requireContext())
            builder.setView(view)

            val dialog = builder.create()
            dialog.show()
            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

        }

fragmentBinding.detailServiceTwo.setOnClickListener{
            val view = View.inflate(requireContext(),R.layout.alertdialog_service,null)
            val builder = AlertDialog.Builder(requireContext())
            builder.setView(view)
            val dialog = builder.create()
            dialog.show()
            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        }

        fragmentBinding.serviceRecyclerView.apply {
            adapter = ServiceTopItemsAdapter(requireContext())
            layoutManager =
                LinearLayoutManager(
                    requireContext(),
                    LinearLayoutManager.HORIZONTAL,
                    false
                )
        }
        return fragmentBinding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val navBottom = requireActivity().findViewById<BottomNavigationView>(R.id.bottom_navigation)
//        navBottom.visibility = View.VISIBLE

//        navBottom.setOnItemSelectedListener {
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