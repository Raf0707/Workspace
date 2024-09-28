package raf.console.data.models

data class Job(
    val id: Int,
    val title: String,
    val company: String,
    val location: String,
    val publishedDate: String,
    val isFavorite: Boolean,
    val experience: String,
    val link: String
)