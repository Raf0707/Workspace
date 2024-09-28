package raf.console.data.api

// data/api/RetrofitInstance.kt
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private const val BASE_URL = "https://api.example.com/" // Замените на реальный URL API

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: JobApiService by lazy {
        retrofit.create(JobApiService::class.java)
    }
}
