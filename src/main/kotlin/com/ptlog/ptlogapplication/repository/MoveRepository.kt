package com.ptlog.ptlogapplication.repository

import com.ptlog.ptlogapplication.domain.Move
import org.springframework.data.mongodb.repository.MongoRepository


interface MoveRepository : MongoRepository<Move, String> {

    fun findByMove(move: String): Move
}