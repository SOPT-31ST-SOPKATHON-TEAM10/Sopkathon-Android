package org.sopt.sopkathon10.data.service

import org.sopt.sopkathon10.data.dto.response.ResponseDummy
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface SopkathonService {
    @GET("comment/album/{albumId}")
    fun getComment(
        @Path("albumId") albumId: String
    ): Call<ResponseDummy>
}