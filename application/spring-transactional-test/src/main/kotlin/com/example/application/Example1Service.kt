package com.example.application

import com.example.domain.entity.ExampleEntity
import com.example.domain.repository.ExampleRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.PlatformTransactionManager

@Service
class Example1Service(
    private val exampleRepository: ExampleRepository,
    private val transactionManager: PlatformTransactionManager
) {
    fun example() {
        exampleRepository.save(
            ExampleEntity(
                exampleColumn = "test01"
            )
        )

        transactionManager.commit(transactionManager.getTransaction(null))
    }
}