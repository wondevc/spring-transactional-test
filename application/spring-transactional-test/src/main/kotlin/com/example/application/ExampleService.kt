package com.example.application

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ExampleService(
    private val example1Service: Example1Service,
    private val example2Service: Example2Service,
) {
    @Transactional(rollbackFor = [Exception::class])
    fun example() {
        example1Service.example()
        example2Service.example()
    }
}