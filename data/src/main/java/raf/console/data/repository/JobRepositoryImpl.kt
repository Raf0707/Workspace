// data/repository/JobRepositoryImpl.kt
package raf.console.data.repository

import raf.console.data.api.JobApiService
import raf.console.data.models.Job
import raf.console.domain.repositories.JobRepository


class JobRepositoryImpl(private val apiService: JobApiService) : JobRepository {
    override suspend fun getJobs(): List<Job> {
        return apiService.getJobs()
    }
}
