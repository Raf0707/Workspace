package raf.console.domain.repositories

import raf.console.data.models.Job // Импортируйте ваш класс Job

// domain/repositories/JobRepository.kt
interface JobRepository {
    suspend fun getJobs(): List<Job> // Возвращает список объектов Job
}
