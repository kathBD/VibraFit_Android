package com.octapus.vibrafit

data class ExerciseResponse(
    val results: List<Exercise>
)

data class Exercise(
    val id: Int,
    val name: String,
    val description: String,
    val category: Category,
    val muscles: List<Int>,
    val images: List<Image>
)

data class Category(
    val id: Int,
    val name: String
)

data class Image(
    val id: Int,
    val image: String
)
