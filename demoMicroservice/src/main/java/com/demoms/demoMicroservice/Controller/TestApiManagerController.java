package com.demoms.demoMicroservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiManagerController {

    @GetMapping("/test")
    public String testEndpoint() {
        return "API is working!";
    }
}
