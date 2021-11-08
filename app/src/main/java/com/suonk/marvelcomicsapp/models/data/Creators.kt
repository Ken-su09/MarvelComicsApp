package com.suonk.marvelcomicsapp.models.data

data class Creators(
    val available: Int = 0,
    val collectionURI: String = "",
    val items: List<ItemX> = listOf(),
    val returned: Int = 0
)