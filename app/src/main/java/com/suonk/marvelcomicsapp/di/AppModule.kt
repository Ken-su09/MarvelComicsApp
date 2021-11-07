package com.suonk.marvelcomicsapp.di

import com.suonk.marvelcomicsapp.api.MarvelApiService
import com.suonk.marvelcomicsapp.repositories.DefaultRepository
import com.suonk.marvelcomicsapp.repositories.MainRepository
import com.suonk.marvelcomicsapp.utils.Constants.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    fun provideRetrofit(): Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Provides
    fun provideApiService(retrofit: Retrofit): MarvelApiService =
        retrofit.create(MarvelApiService::class.java)

    @Provides
    fun provideDefaultRepository(api: MarvelApiService): DefaultRepository =
        MainRepository(api)
}