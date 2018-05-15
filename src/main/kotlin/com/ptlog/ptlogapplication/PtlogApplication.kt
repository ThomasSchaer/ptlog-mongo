package com.ptlog.ptlogapplication

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PtlogApplication

fun main(args: Array<String>) {
    runApplication<PtlogApplication>(*args)
}
