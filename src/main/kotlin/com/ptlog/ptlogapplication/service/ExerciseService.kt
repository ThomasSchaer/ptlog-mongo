package com.ptlog.ptlogapplication.service

import com.ptlog.ptlogapplication.domain.Exercise

interface ExerciseService {
    fun findAll(): List<Exercise>
    fun save(exercise: Exercise): Exercise
    fun findByMove(move: String): Exercise
    fun deleteById(move: String)
}