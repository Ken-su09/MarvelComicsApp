package com.suonk.marvelcomicsapp.models.data

data class ComicsResponse(
    val attributionHTML: String = "",
    val attributionText: String = "",
    val code: Int = 0,
    val copyright: String = "",
    val data: Data,
    val etag: String = "",
    val status: String = ""
)