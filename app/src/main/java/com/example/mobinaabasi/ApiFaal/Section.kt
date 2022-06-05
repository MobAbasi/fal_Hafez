package com.example.mobinaabasi.ApiFaal

data class Section(
    val cachedFirstCoupletIndex: Int,
    val excerpt: Any,
    val ganjoorMetre: GanjoorMetre,
    val ganjoorMetreId: Int,
    val ganjoorMetreRefSectionIndex: Any,
    val htmlText: String,
    val id: Int,
    val index: Int,
    val modified: Boolean,
    val number: Int,
    val oldGanjoorMetreId: Any,
    val oldRhymeLetters: Any,
    val plainText: String,
    val poem: Any,
    val poemFormat: Int,
    val poemId: Int,
    val poet: Any,
    val poetId: Int,
    val rhymeLetters: String,
    val sectionType: Int,
    val top6RelatedSections: List<Top6RelatedSection>,
    val verseType: Int
)