package com.example.mobinaabasi.ApiBio

data class MyDataItem(
    val birthPlace: String,
    val birthPlaceLatitude: Double,
    val birthPlaceLongitude: Double,
    val birthYearInLHijri: Int,
    val deathPlace: String,
    val deathPlaceLatitude: Double,
    val deathPlaceLongitude: Double,
    val deathYearInLHijri: Int,
    val description: Any,
    val fullUrl: String,
    val id: Int,
    val imageUrl: String,
    val name: String,
    val nickname: String,
    val pinOrder: Int,
    val published: Boolean,
    val rootCatId: Int,
    val validBirthDate: Boolean,
    val validDeathDate: Boolean
)