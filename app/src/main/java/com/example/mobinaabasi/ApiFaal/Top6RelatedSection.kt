package com.example.mobinaabasi.ApiFaal

data class Top6RelatedSection(
    val fullTitle: String,
    val fullUrl: String,
    val htmlExcerpt: String,
    val id: Int,
    val poem: Any,
    val poemId: Int,
    val poetId: Int,
    val poetImageUrl: String,
    val poetMorePoemsLikeThisCount: Int,
    val poetName: String,
    val relationOrder: Int,
    val sectionIndex: Int,
    val targetPoemId: Int,
    val targetSectionIndex: Int
)