package com.example.splash

import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.*

interface APIService {

    @POST("/android/")
    suspend fun post(@Body requestBody: RequestBody): Response<ResponseBody>

    @GET("/android/")
    suspend fun get(): Response<ResponseBody>

    @PUT("/android/")
    suspend fun put(@Body requestBody: RequestBody): Response<ResponseBody>
}