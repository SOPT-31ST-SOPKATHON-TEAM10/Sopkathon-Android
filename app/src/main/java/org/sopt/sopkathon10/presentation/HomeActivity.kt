package org.sopt.sopkathon10.presentation

import android.os.Bundle
import androidx.activity.viewModels
import org.sopt.sopkathon10.R
import org.sopt.sopkathon10.databinding.ActivityHomeBinding
import org.sopt.sopkathon10.util.binding.BindingActivity

class HomeActivity : BindingActivity<ActivityHomeBinding>(R.layout.activity_home) {
    private val viewModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}