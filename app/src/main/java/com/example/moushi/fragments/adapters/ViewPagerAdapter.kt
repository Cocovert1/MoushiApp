package com.example.moushi.fragments.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.moushi.fragments.*

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->{
                HomeFragment()
            }
            1->{
                MenuFragment()
            }
            2->{
                CouponFragment()
            }
            3->{
                OfferFragment()
            }
            4->{
                SettingsFragment()
            }
            else->{
                Fragment()
            }
        }
    }


}