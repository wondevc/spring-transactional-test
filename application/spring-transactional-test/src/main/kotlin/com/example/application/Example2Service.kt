package com.example.application

import org.springframework.stereotype.Service

@Service
class Example2Service {
    fun example() {
        throw Exception()
    }
}