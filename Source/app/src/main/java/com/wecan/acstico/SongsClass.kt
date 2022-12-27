package com.wecan.acstico

data class SongsClass(
    val title: String,
    val trackNumber: Int,
    val year: Int,
    val duration: Int,
    val path: String?,
    val albumName: String,
    val artistName: String,
    val artistId: String
)