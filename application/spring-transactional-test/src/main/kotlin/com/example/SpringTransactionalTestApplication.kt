package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

@EnableJpaRepositories
@EnableTransactionManagement
@SpringBootApplication
class SpringTransactionalTestApplication

fun main(args: Array<String>) {
    runApplication<SpringTransactionalTestApplication>(*args)
}