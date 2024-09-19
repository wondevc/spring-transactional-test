package com.example.domain.entity

import jakarta.persistence.*

@Entity
@Table(name = "example")
data class ExampleEntity(
    @Id
    @Column(name = "id", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @Column(name = "example_column", nullable = false, length = 10)
    val exampleColumn: String
)