package org.sopt.sopkathon10.data.dto.response

import kotlinx.serialization.Serializable

@Serializable
data class ResponseGetMessage(
    val created_at: String,
    val id: Int,
    val is_opened: Int,
    val title: String
)