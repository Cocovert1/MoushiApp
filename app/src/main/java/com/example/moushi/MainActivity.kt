package com.example.moushi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.moushi.fragments.CouponFragment
import com.example.moushi.fragments.HomeFragment
import com.example.moushi.fragments.MenuFragment
import com.example.moushi.fragments.adapters.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout = findViewById<TabLayout>(R.id.tabs)
        val viewPager2 = findViewById<ViewPager2>(R.id.ViewPager2)

        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager2){tab,position->
            when(position){
                0->{
                    tab.setIcon(R.drawable.ic_baseline_home_24)
                }
                1->{
                    tab.setIcon(R.drawable.ic_baseline_restaurant_menu_24)
                }
                2->{
                    tab.setIcon(R.drawable.ic_baseline_rice_bowl_24)
                }
                3->{
                    tab.setIcon(R.drawable.ic_baseline_local_offer_24)
                }
                4->{
                    tab.setIcon(R.drawable.ic_baseline_settings_24)
                }
            }
        }.attach()
    }

}