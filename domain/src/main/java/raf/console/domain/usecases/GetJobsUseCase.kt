package raf.console.domain.usecases


import raf.console.data.models.Job
import raf.console.domain.repositories.JobRepository

// domain/usecases/GetJobsUseCase.kt
class GetJobsUseCase(private val jobRepository: JobRepository) {
    suspend operator fun invoke(): List<Job> {
        return jobRepository.getJobs() // Вызов метода из репозитория
    }
}
