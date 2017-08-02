package com.easy.kotlin.chapter11_kotlin_springboot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Chapter11KotlinSpringbootApplication

fun main(args: Array<String>) {
    SpringApplication.run(Chapter11KotlinSpringbootApplication::class.java, *args)
}
