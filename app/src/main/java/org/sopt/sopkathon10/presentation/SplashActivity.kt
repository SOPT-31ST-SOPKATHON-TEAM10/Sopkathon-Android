package org.sopt.sopkathon10.presentation

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.sopt.sopkathon10.R
import org.sopt.sopkathon10.databinding.ActivityMainBinding
import org.sopt.sopkathon10.util.binding.BindingActivity

@AndroidEntryPoint
class SplashActivity : BindingActivity<ActivityMainBinding>(R.layout.activity_splash) {
    private val viewModel: SplashViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleScope.launch {
            delay(2000)
            addObservers()
        }
    }

    private fun addObservers() {
        viewModel.isLogin.observe(this) {
            moveToNext(it)
        }
    }

    private fun moveToNext(isLogin: Boolean) {
        if (isLogin) startActivity(Intent(this@SplashActivity, HomeActivity::class.java))
        else startActivity(Intent(this@SplashActivity, OnboardingActivity::class.java))
        finish()
    }
}
