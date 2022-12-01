package org.sopt.sopkathon10.presentation

import androidx.lifecycle.*
import dagger.hilt.android.lifecycle.HiltViewModel
import org.sopt.sopkathon10.data.dto.request.RequestMessage
import org.sopt.sopkathon10.data.local.LpPreference
import org.sopt.sopkathon10.data.service.SopkathonService
import org.sopt.sopkathon10.util.extensions.enqueueUtil
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val lpPreference: LpPreference,
) : ViewModel() {
    private val _isLogin = MutableLiveData<Boolean>()
    val isLogin: LiveData<Boolean> get() = _isLogin

    init {
        checkLoginState()
    }

    private fun checkLoginState() {
        _isLogin.value = lpPreference.nickname.isNotBlank()
    }
}