package com.suonk.marvelcomicsapp.models.data

data class Stories(
    val available: Int = 0,
    val collectionURI: String = "",
    val items: List<ItemXX> = listOf(),
    val returned: Int = 0
)