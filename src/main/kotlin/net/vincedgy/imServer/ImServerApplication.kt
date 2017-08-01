package net.vincedgy.imServer

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ImServerApplication

fun main(args: Array<String>) {
    SpringApplication.run(ImServerApplication::class.java, *args)
}
