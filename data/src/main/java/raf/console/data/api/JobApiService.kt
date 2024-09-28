package raf.console.data.api

// data/api/JobApiService.kt
import raf.console.data.models.Job
import retrofit2.http.GET
import retrofit2.http.Path

interface JobApiService {
    @GET("jobs") // Убедитесь, что это правильный путь к API
    suspend fun getJobs(): List<Job>

    // Добавьте дополнительные методы, если необходимо
}
