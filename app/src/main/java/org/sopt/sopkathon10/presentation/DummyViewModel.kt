package org.sopt.sopkathon10.presentation

import androidx.lifecycle.*
import dagger.hilt.android.lifecycle.HiltViewModel
import org.sopt.sopkathon10.data.service.SopkathonService
import org.sopt.sopkathon10.util.extensions.enqueueUtil
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class DummyViewModel @Inject constructor(
    private val sopkathonService: SopkathonService,
) : ViewModel() {
    fun fetchComment() {
        sopkathonService.getComment("test").enqueueUtil({ result ->
            Timber.i("fetchCommentList: $result")
        }, { code ->
            Timber.d("Failed to fetch comment: $code")
        })
    }
}