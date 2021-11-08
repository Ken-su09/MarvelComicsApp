package com.suonk.marvelcomicsapp.api

import com.suonk.marvelcomicsapp.models.data.ComicsResponse
import com.suonk.marvelcomicsapp.utils.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MarvelApiService {

    @GET("comics")
    suspend fun getAllComics(
        @Query("format")
        format: String,
        @Query("formatType")
        formatType: String,
        @Query("apiKey")
        apiKey: String = API_KEY,
    ): Response<ComicsResponse>
}