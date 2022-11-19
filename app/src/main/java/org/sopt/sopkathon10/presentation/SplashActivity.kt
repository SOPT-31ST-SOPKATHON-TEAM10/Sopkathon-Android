package org.sopt.sopkathon10.presentation

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.sopt.sopkathon10.R
import org.sopt.sopkathon10.databinding.ActivityMainBinding
import org.sopt.sopkathon10.util.binding.BindingActivity

@AndroidEntryPoint
class SplashActivity : BindingActivity<ActivityMainBinding>(R.layout.activity_splash) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleScope.launch {
            delay(2000)
            startActivity(Intent(this@SplashActivity, OnboardingActivity::class.java))
            finish()
        }
    }
}
