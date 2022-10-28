package com.cpr.tabapplication

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.cpr.tabapplication.fragment.Cricket
import com.cpr.tabapplication.fragment.Football
import com.cpr.tabapplication.fragment.NBA

internal class MyAdapter(
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int
) :
    FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                Football()
            }
            1 -> {
                Cricket()
            }
            2 -> {
                NBA()
            }
            else -> getItem(position)
        }
    }
    override fun getCount(): Int {
        return totalTabs
    }
}