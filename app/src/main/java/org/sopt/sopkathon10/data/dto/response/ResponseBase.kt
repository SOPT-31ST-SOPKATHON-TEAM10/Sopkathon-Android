package org.sopt.sopkathon10.data.dto.response

import kotlinx.serialization.Serializable

@Serializable
data class ResponseBase<T>(
    val status: Int,
    val success: Boolean,
    val message: String,
    val data: T,
)