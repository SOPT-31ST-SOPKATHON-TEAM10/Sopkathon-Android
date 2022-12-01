package org.sopt.sopkathon10.presentation

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import org.sopt.sopkathon10.R
import org.sopt.sopkathon10.databinding.ActivityAccountBinding
import org.sopt.sopkathon10.util.binding.BindingActivity

@AndroidEntryPoint
class AccountActivity : BindingActivity<ActivityAccountBinding>(R.layout.activity_account) {
    private val viewModel: OnboardingViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        addObservers()
    }

    private fun addObservers() {
        viewModel.isCompletedSignIn.observe(this) {
            setResult(RESULT_OK, Intent(this, OnboardingActivity::class.java))
            finish()
        }
    }
}