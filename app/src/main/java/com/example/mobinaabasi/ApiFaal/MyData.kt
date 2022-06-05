package com.example.mobinaabasi.ApiFaal

data class MyData(
    val category: Any,
    val comments: Any,
    val fullTitle: String,
    val fullUrl: String,
    val htmlText: String,
    val id: Int,
    val images: Any,
    val language: Any,
    val mixedModeOrder: Int,
    val next: Any,
    val oldTag: Any,
    val oldTagPageUrl: Any,
    val plainText: String,
    val previous: Any,
    val published: Boolean,
    val recitations: List<Recitation>,
    val sections: List<Section>,
    val songs: Any,
    val sourceName: String,
    val sourceUrlSlug: String,
    val title: String,
    val urlSlug: String,
    val verses: List<Verse>
)