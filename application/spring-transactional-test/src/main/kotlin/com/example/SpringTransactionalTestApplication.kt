package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringTransactionalTestApplication

fun main(args: Array<String>) {
    runApplication<SpringTransactionalTestApplication>(*args)
}