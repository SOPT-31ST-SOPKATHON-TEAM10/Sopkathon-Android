package org.sopt.sopkathon10.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import org.sopt.sopkathon10.data.dto.ResponseLetter
import org.sopt.sopkathon10.data.dto.ResponseLetter.Category
import org.sopt.sopkathon10.data.local.LpPreference
import org.sopt.sopkathon10.data.service.SopkathonService
import org.sopt.sopkathon10.domain.entity.Letter
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val sopkathonService: SopkathonService,
    private val lpPreference: LpPreference,
) : ViewModel() {
    private val _letters = MutableLiveData<List<Letter>>()
    val letters: LiveData<List<Letter>> get() = _letters
    private val _nickname = MutableLiveData<String>()
    val nickname: LiveData<String> get() = _nickname

    init {
        fetchUserInfo()
        fetchLetters()
    }

    private fun fetchUserInfo() {
        _nickname.value = lpPreference.nickname
    }

    private fun fetchLetters() {
        // TODO 서버에서 데이터 받아오기
        _letters.value = listOf(
            ResponseLetter(0, Category(1, "수고했어 오늘도")),
            ResponseLetter(0, Category(2, "오늘은 그냥 엉엉 울어버려도 좋아")),
            ResponseLetter(0, Category(3, "들으면서 네 생각 났어")),
            ResponseLetter(7, Category(4, "설레고 싶은 너에게")),
            ResponseLetter(2, Category(5, "산뜻하게 하루를 시작하고 싶은 날에는")),
            ResponseLetter(0, Category(6, "들으면 신날거야!"))
        ).map { it.toLetter(it) }
    }
}