package com.ptlog.ptlogapplication.repository

import com.ptlog.ptlogapplication.domain.Exercise
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ExerciseRepository : MongoRepository<Exercise, String> {

    fun findByMove(move: String): Exercise
}