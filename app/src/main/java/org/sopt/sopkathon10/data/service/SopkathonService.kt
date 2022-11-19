package org.sopt.sopkathon10.data.service

import org.sopt.sopkathon10.data.dto.request.RequestMessage
import org.sopt.sopkathon10.data.dto.response.ResponseBase
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface SopkathonService {
    @POST("/message")
    fun writeMessage(
        @Body message: RequestMessage
    ): Call<ResponseBase<Int>>
}