package org.sopt.sopkathon10.presentation

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import org.sopt.sopkathon10.R
import org.sopt.sopkathon10.databinding.ActivityHomeBinding
import org.sopt.sopkathon10.domain.entity.Letter
import org.sopt.sopkathon10.util.binding.BindingActivity

@AndroidEntryPoint
class HomeActivity : BindingActivity<ActivityHomeBinding>(R.layout.activity_home) {
    private val viewModel: HomeViewModel by viewModels()
    private val adapter = LetterAdapter(::moveToLetterDetail)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        initLayout()
        addListeners()
        addObservers()
    }

    private fun initLayout() {
        binding.rvLetterList.adapter = adapter
    }

    private fun addListeners() {
        binding.fabSend.setOnClickListener {
            startActivity(Intent(this, WritingMessageActivity::class.java))
        }
    }

    private fun addObservers() {
        viewModel.letters.observe(this) {
            adapter.submitList(it.toMutableList())
        }
    }

    private fun moveToLetterDetail(letter: Letter) {
        // TODO 상세조회 화면으로 이동 시 메세지 카테고리 정보 전달
        startActivity(Intent(this, MessageListActivity::class.java))
    }
}