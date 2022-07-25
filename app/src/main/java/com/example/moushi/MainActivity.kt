package com.example.moushi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.moushi.fragments.CouponFragment
import com.example.moushi.fragments.HomeFragment
import com.example.moushi.fragments.MenuFragment
import com.example.moushi.fragments.adapters.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(), "")
        adapter.addFragment(MenuFragment(), "")
        adapter.addFragment(CouponFragment(), "")
        val viewPager = findViewById<ViewPager>(R.id.ViewPager)
        viewPager.adapter = adapter
        val tabs = findViewById<TabLayout>(R.id.tabs)
        tabs.setupWithViewPager(viewPager)

        tabs.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24)
        tabs.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_restaurant_menu_24)
        tabs.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_rice_bowl_24)


    }
}