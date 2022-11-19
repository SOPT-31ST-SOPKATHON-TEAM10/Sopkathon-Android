package org.sopt.sopkathon10.data.dto.request

import kotlinx.serialization.Serializable

@Serializable
data class RequestMessage(
    val title: String,
    val artist: String,
    val contents: String,
    val categoryId: Int,
    val nickname: String,
)
