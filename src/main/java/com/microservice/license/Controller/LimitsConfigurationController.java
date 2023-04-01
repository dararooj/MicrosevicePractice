package com.microservice.license.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class LimitsConfigurationController {
    @GetMapping("/limits")
    public LimitConfiguration retriveLimitsFromConfigurations()
    {
        return new LimitConfiguration(1000, 1);
    }
}
