package org.sopt.sopkathon10.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.sopt.sopkathon10.R
import org.sopt.sopkathon10.databinding.FragmentTabEntireBinding
import org.sopt.sopkathon10.util.binding.BindingFragment


class TabEntireFragment : BindingFragment<FragmentTabEntireBinding>(R.layout.fragment_tab_entire) {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return binding.root
    }

}