package org.sopt.sopkathon10.presentation

import androidx.lifecycle.*
import dagger.hilt.android.lifecycle.HiltViewModel
import org.sopt.sopkathon10.data.local.LpPreference
import javax.inject.Inject

@HiltViewModel
class OnboardingViewModel @Inject constructor(
    private val lpPreference: LpPreference,
) : ViewModel() {
    val nickname = MutableLiveData<String>()

    private val _isCompletedSignIn = MutableLiveData<Boolean>()
    val isCompletedSignIn: LiveData<Boolean> get() = _isCompletedSignIn

    // TODO 서버 연동 시 삭제 예정
    fun isLogin() = lpPreference.nickname.isNotBlank()

    fun createAccount() {
        if (nickname.value == null) {
            _isCompletedSignIn.value = false
        } else {
            lpPreference.nickname = nickname.value!!
            _isCompletedSignIn.value = true
        }
    }

    fun setNickname() {
        nickname.value = lpPreference.nickname
    }
}