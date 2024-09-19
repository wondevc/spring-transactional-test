package com.example.application

import com.example.domain.entity.ExampleEntity
import com.example.domain.repository.ExampleRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.PlatformTransactionManager
import org.springframework.transaction.TransactionDefinition
import org.springframework.transaction.support.DefaultTransactionDefinition

@Service
class Example1Service(
    private val exampleRepository: ExampleRepository,
    private val transactionManager: PlatformTransactionManager
) {
    fun example() {
        val definition = DefaultTransactionDefinition().apply {
            setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED)
        }

        val transactionStatus = transactionManager.getTransaction(definition)

        runCatching {
            exampleRepository.save(
                ExampleEntity(
                    exampleColumn = "test01"
                )
            )
            transactionManager.commit(transactionStatus)
        }.isSuccess.takeIf { !it }?.let {
            transactionManager.rollback(transactionStatus)
        }
    }
}