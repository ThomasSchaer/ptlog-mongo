package com.ptlog.ptlogapplication.domain

import org.springframework.data.annotation.Id

class Exercise(@Id var move: String, var kilogram: Int, var repetition: Int)