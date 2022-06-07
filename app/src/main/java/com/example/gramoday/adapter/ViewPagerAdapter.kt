package com.example.gramoday.adapter


import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.gramoday.fragment.BusinessFragment
import com.example.gramoday.fragment.ReviewFragment

class ViewPagerAdapter(context: Context, fragmentManager: FragmentManager,lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {

    val context =context
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return   when(position){
            0->{
                BusinessFragment(context)
            }
            1->{
                ReviewFragment()
            }
            else->{
                Fragment()
            }

        }
    }
}
