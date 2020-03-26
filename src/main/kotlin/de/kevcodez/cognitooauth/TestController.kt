package de.kevcodez.cognitooauth

import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/hello")
    @PreAuthorize("hasAuthority('user')")
    fun hello(): String {
        return "I am authenticated"
    }
}
