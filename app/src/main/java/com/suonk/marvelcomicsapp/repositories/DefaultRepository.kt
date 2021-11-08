package com.suonk.marvelcomicsapp.repositories

import com.suonk.marvelcomicsapp.models.data.ComicsResponse
import retrofit2.Response

interface DefaultRepository {

    suspend fun getAllComics(
        format: String,
        formatType: String
    ): Response<ComicsResponse>
}