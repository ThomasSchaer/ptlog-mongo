package com.ptlog.ptlogapplication.controller

import com.ptlog.ptlogapplication.domain.Exercise
import org.springframework.web.bind.annotation.*
import com.ptlog.ptlogapplication.service.ExerciseService

@RestController
class ExerciseController(val exerciseService: ExerciseService) {

    @PostMapping("/exercises")
    fun postExercise(@RequestBody exercise: Exercise): Exercise {
        return exerciseService.save(exercise)
    }

    @GetMapping("/exercises")
    fun getExercises(): List<Exercise> {
        return exerciseService.findAll()
    }

    @GetMapping("/hello")
    fun hello(): String {
        return "fdf"
    }


    @GetMapping("/exercises/{move}")
    fun getOne (@PathVariable move: String) = exerciseService.findByMove(move)

    @DeleteMapping("/exercises/{move}")
    fun deleteOne (@PathVariable move: String) = exerciseService.deleteById(move)

    @PutMapping("/exercises/{move}")
    fun putExercise(@PathVariable move: String, @RequestBody exercise: Exercise): Exercise {
        val exerciseFound = exerciseService.findByMove(move)
        exerciseFound.move = exercise.move
        return exerciseService.save(exercise)
    }
}
