package com.zpf.novademo01

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication()
@ComponentScan(value = arrayOf("org.jooq"))
class Novademo01Application
fun main(args: Array<String>) {
    runApplication<Novademo01Application>(*args)
}
