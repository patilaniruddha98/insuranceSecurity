package com.delta.security

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class SecurityApplication

fun main(args: Array<String>) {
	runApplication<SecurityApplication>(*args)
}
