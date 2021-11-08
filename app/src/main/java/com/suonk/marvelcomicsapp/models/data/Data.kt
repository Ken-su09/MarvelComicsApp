package com.suonk.marvelcomicsapp.models.data

data class Data(
    val count: Int = 0,
    val limit: Int = 0,
    val offset: Int = 0,
    val results: MutableList<Result>,
    val total: Int = 0
)