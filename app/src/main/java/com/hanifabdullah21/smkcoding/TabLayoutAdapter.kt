package com.hanifabdullah21.smkcoding

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class TabLayoutAdapter
    (fm: FragmentManager, context: Context)
    : FragmentStatePagerAdapter(fm)
{
    override fun getItem(position: Int): Fragment {
        val movieFragment = MovieFragment()

        val bundle = Bundle()
        when(position){
            0 -> bundle.putString("KEY", "MOVIE")
            1 -> bundle.putString("KEY", "TV")
        }

        movieFragment.arguments = bundle

        return movieFragment
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "MOVIE"
            1 -> "TV"
            else -> "TIDAK ADA"
        }
    }

}