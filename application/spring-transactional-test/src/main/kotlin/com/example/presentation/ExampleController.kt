package com.example.presentation

import com.example.application.ExampleService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/example")
@RestController
class ExampleController(
    private val exampleService: ExampleService
) {
    @PostMapping
    fun example(): ResponseEntity<Unit> {
        exampleService.example()

        return ResponseEntity.noContent().build()
    }
}