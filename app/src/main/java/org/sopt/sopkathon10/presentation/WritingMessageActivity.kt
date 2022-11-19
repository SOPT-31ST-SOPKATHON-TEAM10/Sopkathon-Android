package org.sopt.sopkathon10.presentation

import android.os.Bundle
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import org.sopt.sopkathon10.R
import org.sopt.sopkathon10.databinding.ActivityWritingMessageBinding
import org.sopt.sopkathon10.util.binding.BindingActivity

@AndroidEntryPoint
class WritingMessageActivity :
    BindingActivity<ActivityWritingMessageBinding>(R.layout.activity_writing_message) {
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