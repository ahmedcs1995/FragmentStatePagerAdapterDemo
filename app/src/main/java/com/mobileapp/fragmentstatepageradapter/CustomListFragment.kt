package com.mobileapp.fragmentstatepageradapter

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.ListFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class CustomListFragment: Fragment() {

    internal var fragNum: Int = 0
    private val TAG = CustomListFragment::class.java!!.getSimpleName()
    internal var arr = arrayOf("This is", "a Truiton", "Demo", "App", "For", "Showing", "FragmentStatePagerAdapter", "and ViewPager", "Implementation", "This is", "a Truiton", "Demo", "App", "For", "Showing", "FragmentStatePagerAdapter", "and ViewPager", "Implementation", "This is", "a Truiton", "Demo", "App", "For", "Showing", "FragmentStatePagerAdapter", "and ViewPager", "Implementation", "This is", "a Truiton", "Demo", "App", "For", "Showing", "FragmentStatePagerAdapter", "and ViewPager", "Implementation", "This is", "a Truiton", "Demo", "App", "For", "Showing", "FragmentStatePagerAdapter", "and ViewPager", "Implementation", "This is", "a Truiton", "Demo", "App", "For", "Showing", "FragmentStatePagerAdapter", "and ViewPager", "Implementation")

    companion object {
        fun init() : CustomListFragment {
            return CustomListFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onDetach() {
        super.onDetach()
    }
}