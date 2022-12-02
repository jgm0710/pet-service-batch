package com.noodabee.petservicebatch.presentation

import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheckController(
    private val environment: Environment
) {

    @GetMapping("/health-check")
    fun healthCheck(): String {
        val port = environment.getProperty("local.server.port") ?: ""
        return "PetServiceBatchApplication is healthy. Running port : [$port]"
    }
}
