package com.example.mobinaabasi.ApiFaal

data class Recitation(
    val audioArtist: String,
    val audioArtistUrl: String,
    val audioSrc: String,
    val audioSrcUrl: String,
    val audioTitle: String,
    val fileLastUpdated: String,
    val htmlText: String,
    val id: Int,
    val legacyAudioGuid: String,
    val mistakes: List<Any>,
    val mp3FileCheckSum: String,
    val mp3SizeInBytes: Int,
    val mp3Url: String,
    val plainText: String,
    val poemFullTitle: String,
    val poemFullUrl: String,
    val poemId: Int,
    val publishDate: String,
    val xmlText: String
)