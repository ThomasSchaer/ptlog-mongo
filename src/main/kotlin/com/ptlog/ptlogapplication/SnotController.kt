package com.ptlog.ptlogapplication

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SnotController {
    @GetMapping("/h")
    fun snot(): String{
        return "dasda"
    }


}