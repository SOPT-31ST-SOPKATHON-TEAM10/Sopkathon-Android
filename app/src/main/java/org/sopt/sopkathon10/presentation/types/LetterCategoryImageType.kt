package org.sopt.sopkathon10.presentation.types

import androidx.annotation.DrawableRes
import org.sopt.sopkathon10.R

enum class LetterCategoryImageType(@DrawableRes val imgRes: Int) {
    GREEN_LETTER(R.drawable.ic_letter_green),
    BLUE_LETTER(R.drawable.ic_letter_blue),
    RED_LETTER(R.drawable.ic_letter_red),
    YELLOW_LETTER(R.drawable.ic_letter_yellow),
    MINT_LETTER(R.drawable.ic_letter_mint),
    IVORY_LETTER(R.drawable.ic_letter_ivory)
}