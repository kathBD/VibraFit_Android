package com.octapus.vibrafit

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("exerciseinfo/")
    suspend fun getExercises(
        @Query("language") language: Int = 2,
        @Query("limit") limit: Int = 50
    ): ExerciseResponse
}
