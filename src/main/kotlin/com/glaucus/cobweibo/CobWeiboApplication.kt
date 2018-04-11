package com.glaucus.cobweibo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CobWeiboApplication

fun main(args: Array<String>) {
    runApplication<CobWeiboApplication>(*args)
}
