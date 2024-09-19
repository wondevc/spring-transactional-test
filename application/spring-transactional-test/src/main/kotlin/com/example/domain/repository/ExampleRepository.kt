package com.example.domain.repository

import com.example.domain.entity.ExampleEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ExampleRepository : JpaRepository<ExampleEntity, Long>