package org.sopt.sopkathon10.presentation

import android.content.Intent
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import org.sopt.sopkathon10.R
import org.sopt.sopkathon10.databinding.ActivityOnboardingBinding
import org.sopt.sopkathon10.util.binding.BindingActivity
import org.sopt.sopkathon10.util.extensions.showToast

@AndroidEntryPoint
class OnboardingActivity :
    BindingActivity<ActivityOnboardingBinding>(R.layout.activity_onboarding) {
    private val viewModel: OnboardingViewModel by viewModels()
    private lateinit var launcher: ActivityResultLauncher<Intent>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        setResultLauncher()
        addListeners()
    }

    private fun setResultLauncher() {
        launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            viewModel.setNickname()
        }
    }

    private fun addListeners() {
        binding.btnEnter.setOnClickListener {
            if (viewModel.isLogin()) {
                startActivity(Intent(this, HomeActivity::class.java))
                finish()
            } else {
                showToast(getString(R.string.onboarding_account_toast_meaasage))
            }
        }
        binding.tvSignup.setOnClickListener {
            launcher.launch(Intent(this, AccountActivity::class.java))
        }
    }
}