package org.sopt.sopkathon10.data.dto.request

@kotlinx.serialization.Serializable
data class RequestMessage(
    val title: String,
    val artists: String,
    val contents: String,
    val categoryId: Int,
    val nickname: String,
)
