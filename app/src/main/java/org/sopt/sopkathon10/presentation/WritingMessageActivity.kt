package org.sopt.sopkathon10.presentation

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import org.sopt.sopkathon10.R
import org.sopt.sopkathon10.data.dto.request.RequestMessage
import org.sopt.sopkathon10.data.service.SopkathonService
import org.sopt.sopkathon10.databinding.ActivityWritingMessageBinding
import org.sopt.sopkathon10.util.binding.BindingActivity
import org.sopt.sopkathon10.util.extensions.enqueueUtil
import timber.log.Timber
import javax.inject.Inject

@AndroidEntryPoint
class WritingMessageActivity :
    BindingActivity<ActivityWritingMessageBinding>(R.layout.activity_writing_message) {
    private val viewModel: DummyViewModel by viewModels()
    @Inject lateinit var sopkathonService: SopkathonService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_writing_message
        )
        addListeners()
    }

    private fun initLayout() {

    }

    private fun addListeners() {
        binding.btnSendMessage.setOnClickListener {
            sopkathonService.writeMessage(RequestMessage(
                binding.etSongTitle.text.toString(),
                binding.etSongArtist.text.toString(),
                binding.etWriteMessage.text.toString(),
                1,
                "혜수"
            )).enqueueUtil({ result ->
                if (result.success) {
                    Toast.makeText(this@WritingMessageActivity, result.message, Toast.LENGTH_SHORT).show()
                    finish()
                }
                else {
                    Snackbar.make(binding.root, result.message, Snackbar.LENGTH_SHORT).show()
                }
                Timber.i("fetchCommentList: $result")
            }, { code ->
                Timber.d("Failed to fetch comment: $code")
            })
        }
    }

    private fun addObservers() {

    }
}