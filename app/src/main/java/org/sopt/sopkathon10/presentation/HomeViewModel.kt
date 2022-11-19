package org.sopt.sopkathon10.presentation

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import org.sopt.sopkathon10.data.service.SopkathonService
import org.sopt.sopkathon10.presentation.model.LetterInfo
import org.sopt.sopkathon10.presentation.types.LetterCategory
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val sopkathonService: SopkathonService,
) : ViewModel() {
    val letters: List<LetterInfo> = listOf(LetterInfo(1, "12345", LetterCategory.ONE),
        LetterInfo(0, "12345", LetterCategory.TWO),
        LetterInfo(0, "12345", LetterCategory.THREE),
        LetterInfo(0, "12345", LetterCategory.FOUR),
        LetterInfo(0, "12345", LetterCategory.FIVE),
        LetterInfo(0, "12345", LetterCategory.SIX))
}