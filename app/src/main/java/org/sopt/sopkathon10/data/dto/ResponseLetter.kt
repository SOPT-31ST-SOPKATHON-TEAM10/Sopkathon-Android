package org.sopt.sopkathon10.data.dto

import kotlinx.serialization.Serializable
import org.sopt.sopkathon10.domain.entity.Letter
import org.sopt.sopkathon10.presentation.types.LetterCategoryImageType
import timber.log.Timber

@Serializable
data class ResponseLetter(
    val messageCount: Int,
    val category: Category,
) {
    @Serializable
    data class Category(
        val id: Int,
        val name: String,
    )

    fun toLetter(letter: ResponseLetter): Letter {
        val size = LetterCategoryImageType.values().size
        val imageType = when(letter.category.id % size) {
            1 -> LetterCategoryImageType.GREEN_LETTER
            2 -> LetterCategoryImageType.BLUE_LETTER
            3 -> LetterCategoryImageType.RED_LETTER
            4 -> LetterCategoryImageType.YELLOW_LETTER
            5 -> LetterCategoryImageType.MINT_LETTER
            else -> LetterCategoryImageType.IVORY_LETTER
        }

        Timber.d("${letter.category.id}, $imageType")
        return Letter(letter.category.id,
            letter.category.name, messageCount, imageType)
    }
}