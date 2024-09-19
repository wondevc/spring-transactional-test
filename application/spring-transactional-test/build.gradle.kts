import org.springframework.boot.gradle.tasks.bundling.BootJar

group = "com.example"
version = "0.0.1-SNAPSHOT"

plugins {
    id("org.springframework.boot") version "3.3.3"
    id("io.spring.dependency-management") version "1.1.6"
    kotlin("plugin.spring") version "2.0.20"
    kotlin("plugin.jpa") version "2.0.20"
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("com.mysql:mysql-connector-j:8.4.0")
}

allOpen {
    annotation("jakarta.persistence.Entity")
}

tasks {
    withType<BootJar> {
        enabled = true
    }
}