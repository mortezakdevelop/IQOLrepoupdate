package com.example.debugnavigationsinglefragment

import androidx.fragment.app.*
import androidx.viewpager2.adapter.FragmentStateAdapter

class ScreenSlidePagerAdapter(manager: FragmentActivity) : FragmentStateAdapter(manager){
    private val mFragmentList: MutableList<Fragment> = ArrayList()

    // add function for add list fragments
    fun addFrag(fragment: Fragment?) {
        mFragmentList.add(fragment!!)
    }

    override fun getItemCount(): Int = mFragmentList.size

    override fun createFragment(position: Int): Fragment = mFragmentList[position]
}


