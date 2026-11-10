package com.albanileria.model

import java.time.Instant

data class HealthStatus(
    val status: String,
    val service: String,
    val timestamp: Instant,
)
