package org.sopt.sopkathon10.domain.entity

import org.sopt.sopkathon10.presentation.types.LetterCategoryImageType

data class Letter(
    val id: Int,
    val title: String,
    val messageCount: Int,
    val categoryImageType: LetterCategoryImageType
)