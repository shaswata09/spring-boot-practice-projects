package com.leonardo.example.limitsservice;

import com.leonardo.example.limitsservice.bean.LimitConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @GetMapping (path = "/limits")
    public LimitConfiguration retrieveLimitsFromConfigurations (){
        return new LimitConfiguration(1, 1000);
    }
}
