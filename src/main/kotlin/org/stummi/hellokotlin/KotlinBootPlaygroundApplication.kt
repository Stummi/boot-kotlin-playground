package org.stummi.hellokotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinBootPlaygroundApplication

fun main(args: Array<String>) {
    runApplication<KotlinBootPlaygroundApplication>(*args)
}

