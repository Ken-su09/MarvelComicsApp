package com.suonk.marvelcomicsapp.repositories

import com.suonk.marvelcomicsapp.api.MarvelApiService
import com.suonk.marvelcomicsapp.models.data.ComicsResponse
import retrofit2.Response
import javax.inject.Inject

class MainRepository @Inject constructor(private val api: MarvelApiService) : DefaultRepository {

    override suspend fun getAllComics(
        format: String,
        formatType: String
    ): Response<ComicsResponse> = api.getAllComics(format, formatType)
}