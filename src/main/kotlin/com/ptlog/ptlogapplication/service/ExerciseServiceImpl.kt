package com.ptlog.ptlogapplication.service

import com.ptlog.ptlogapplication.domain.Exercise
import com.ptlog.ptlogapplication.repository.ExerciseRepository
import org.springframework.stereotype.Service

@Service
class ExerciseServiceImpl(val exerciseRepository: ExerciseRepository) : ExerciseService {
    override fun findAll(): List<Exercise> {
        return exerciseRepository.findAll()
    }

    override fun save(exercise: Exercise): Exercise {
        return exerciseRepository.save(exercise)
    }

    override fun findByMove(move: String): Exercise {
        return exerciseRepository.findByMove(move)
    }

    override fun deleteById(move: String) {
        return exerciseRepository.deleteById(move)
    }
}