package org.sopt.sopkathon10.presentation.model

import org.sopt.sopkathon10.presentation.types.LetterCategory

data class LetterInfo(
    val count: Int,
    val title: String,
    val letterCategory: LetterCategory
)
