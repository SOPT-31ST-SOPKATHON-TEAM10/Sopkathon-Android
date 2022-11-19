package org.sopt.sopkathon10.presentation

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import dagger.hilt.android.AndroidEntryPoint
import org.sopt.sopkathon10.R
import org.sopt.sopkathon10.databinding.ActivityMessageListBinding
import org.sopt.sopkathon10.util.binding.BindingActivity

@AndroidEntryPoint
class MessageListActivity :
    BindingActivity<ActivityMessageListBinding>(R.layout.activity_message_list) {

    private val tabEntireFragment = TabEntireFragment()
    private val tabReadFragment = TabReadFragment()
    private val tabNotReadFragment = TabNotReadFragment()

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
        Log.i("dd","확인")
        binding.viewPager.adapter = tabAdapter
        binding.viewPager.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                binding.tabMessageList.selectTab(binding.tabMessageList.getTabAt(position))
            }
        })
    }
}