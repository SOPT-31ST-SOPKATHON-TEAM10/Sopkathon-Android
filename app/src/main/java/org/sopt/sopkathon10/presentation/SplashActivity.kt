package org.sopt.sopkathon10.presentation

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import dagger.hilt.android.AndroidEntryPoint
import org.sopt.sopkathon10.R
import org.sopt.sopkathon10.data.dto.response.ResponseBase
import org.sopt.sopkathon10.databinding.ActivityMainBinding
import org.sopt.sopkathon10.util.binding.BindingActivity
import retrofit2.Call
import retrofit2.Response

@AndroidEntryPoint
class SplashActivity : BindingActivity<ActivityMainBinding>(R.layout.activity_splash) {
    private val viewModel: DummyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
