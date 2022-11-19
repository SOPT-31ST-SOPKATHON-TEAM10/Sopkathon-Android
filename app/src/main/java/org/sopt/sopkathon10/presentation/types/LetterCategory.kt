package org.sopt.sopkathon10.presentation.types

import androidx.annotation.DrawableRes
import org.sopt.sopkathon10.R

enum class LetterCategory(@DrawableRes val imgRes: Int) {
    ONE(R.drawable.ic_letter_green), TWO(R.drawable.ic_letter_blue), THREE(R.drawable.ic_letter_read), FOUR(R.drawable.ic_letter_yellow), FIVE(R.drawable.ic_letter_mint), SIX(R.drawable.ic_letter_ivory)
}