package org.sopt.sopkathon10.data.service

import org.sopt.sopkathon10.data.dto.request.RequestMessage
import org.sopt.sopkathon10.data.dto.response.ResponseBase
import org.sopt.sopkathon10.data.dto.response.ResponseGetMessage
import org.sopt.sopkathon10.data.dto.response.ResponseShowMessage
import retrofit2.Call
import retrofit2.http.*

interface SopkathonService {
    @POST("/message")
    fun writeMessage(
        @Body message: RequestMessage
    ): Call<ResponseBase<Int>>

    @GET("/message/{categoryId}")
    fun getMessage(
        @Path("categoryId") categoryId: Int,
        @Query("nickname") nickname: String,
        @Query("isopened") isOpened: Int
    ): Call<ResponseBase<List<ResponseGetMessage>>>

    @GET("/message/{messageId}")
    fun showMessage(
        @Path("messageId") messageId: Int
    ): Call<ResponseBase<ResponseShowMessage>>
}