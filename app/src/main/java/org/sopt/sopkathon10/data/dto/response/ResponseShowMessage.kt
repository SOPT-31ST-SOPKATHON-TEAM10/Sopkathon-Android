package org.sopt.sopkathon10.data.dto.response

import kotlinx.serialization.Serializable

@Serializable
data class ResponseShowMessage(
    val category: Category,
    val id: Int,
    val title: String,
    val artist: String,
    val contents: String
) {
    @Serializable
    data class Category(
        val id: Int,
        val name: String
    )

}