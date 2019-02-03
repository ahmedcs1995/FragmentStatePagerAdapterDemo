package com.mobileapp.fragmentstatepageradapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

class CustomFragmentPagerAdapter(var fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager){
    override fun getItem(p0: Int): Fragment {
       return CustomListFragment.init()
    }

    override fun getCount(): Int {
        return MainActivity.NUM_ITEMS
    }

}