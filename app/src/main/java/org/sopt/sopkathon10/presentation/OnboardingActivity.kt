package org.sopt.sopkathon10.presentation

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import org.sopt.sopkathon10.R
import org.sopt.sopkathon10.databinding.ActivityOnboardingBinding
import org.sopt.sopkathon10.util.binding.BindingActivity

@AndroidEntryPoint
class OnboardingActivity : BindingActivity<ActivityOnboardingBinding>(R.layout.activity_onboarding) {
    private val viewModel: DummyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addListeners()
    }

    private fun initLayout() {

    }

    private fun addListeners() {
        binding.tvSignup.setOnClickListener {
            startActivity(Intent(this, AccountActivity::class.java))
        }
    }

    private fun addObservers() {

    }
}