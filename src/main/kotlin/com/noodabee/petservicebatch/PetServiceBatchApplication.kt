package com.noodabee.petservicebatch

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PetServiceBatchApplication

fun main(args: Array<String>) {
    runApplication<PetServiceBatchApplication>(*args)
}
