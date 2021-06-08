package com.example.demo

import com.fasterxml.jackson.databind.annotation.JsonSerialize
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

@RestController
class HelloController {
    val mapper = jacksonObjectMapper()

    @RequestMapping("/")
    @JsonSerialize
    fun index(): Movie {
        val movie = Movie("coucou")
        movie.rating = 2
        return movie
    }
}