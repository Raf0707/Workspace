package raf.console.data.repository

import raf.console.data.api.JobApiService
import raf.console.data.models.Job

// data/repository/JobRepository.kt
open class DataJobRepository(private val apiService: JobApiService) {

    open suspend fun getJobs(): List<Job> {
        return apiService.getJobs()
    }
}
