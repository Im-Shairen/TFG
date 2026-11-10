package com.albanileria.controller

import com.albanileria.model.HealthStatus
import com.albanileria.service.HealthService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class HealthController(private val healthService: HealthService) {

    @GetMapping("/health")
    fun health(): HealthStatus = healthService.check()
}
