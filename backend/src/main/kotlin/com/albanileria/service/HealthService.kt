package com.albanileria.service

import com.albanileria.model.HealthStatus
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import java.time.Instant

@Service
class HealthService(
    @Value("\${spring.application.name}") private val serviceName: String,
) {
    fun check(): HealthStatus =
        HealthStatus(status = "UP", service = serviceName, timestamp = Instant.now())
}
