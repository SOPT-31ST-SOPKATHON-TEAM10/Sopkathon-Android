package org.sopt.sopkathon10.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import org.sopt.sopkathon10.R
import org.sopt.sopkathon10.databinding.ActivityMessageListBinding
import org.sopt.sopkathon10.util.binding.BindingActivity


class MessageListActivity :
    BindingActivity<ActivityMessageListBinding>(R.layout.activity_message_list) {

    val tabEntireFragment = TabEntireFragment()
    val tabReadFragment = TabReadFragment()
    val tabNotReadFragment = TabNotReadFragment()

    val fragments = arrayListOf<Fragment>(tabEntireFragment, tabReadFragment, tabNotReadFragment)
    val tabAdapter = object : FragmentStateAdapter(this) {
        override fun getItemCount(): Int {
            return fragments.size
        }

        override fun createFragment(position: Int): Fragment {
            return fragments[position]
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initFragment()
    }

    fun initFragment() {
        binding.viewPager.adapter = tabAdapter
    }
}