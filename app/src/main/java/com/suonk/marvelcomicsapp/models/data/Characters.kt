package com.suonk.marvelcomicsapp.models.data

data class Characters(
    val available: Int = 0,
    val collectionURI: String = "",
    val items: List<Item> = listOf(),
    val returned: Int = 0
)