package org.sopt.sopkathon10.presentation

import android.os.Bundle
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import org.sopt.sopkathon10.R
import org.sopt.sopkathon10.databinding.ActivityAccountBinding
import org.sopt.sopkathon10.util.binding.BindingActivity

@AndroidEntryPoint
class AccountActivity : BindingActivity<ActivityAccountBinding>(R.layout.activity_account) {
    private val viewModel: DummyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    private fun initLayout() {

    }

    private fun addListeners() {

    }

    private fun addObservers() {

    }
}