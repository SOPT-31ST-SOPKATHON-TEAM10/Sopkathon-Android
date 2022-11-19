package org.sopt.sopkathon10.data.service

import org.sopt.sopkathon10.data.dto.request.RequestMessage
import org.sopt.sopkathon10.data.dto.response.ResponseGetMessage
import org.sopt.sopkathon10.data.dto.response.ResponseBase
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface SopkathonService {
    @POST("/message")
    fun writeMessage(
        @Body message: RequestMessage
    ): Call<ResponseBase<Int>>

    @GET("message/1")
    fun getMessage(
        @Query("nickname") nickname:String,
        @Query("isopened") isOpened:Int
    ) :Call <ResponseBase<List<ResponseGetMessage>>>
}