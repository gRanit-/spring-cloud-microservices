package com.granicki.limitsservice.controller;

import com.granicki.limitsservice.Configuration;
import com.granicki.limitsservice.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Wojciech Granicki (SG0223943) on 4/23/18.
 */
@RestController
public class LimitsConfigurationController {

    @Autowired
    Configuration configuration;


    @GetMapping("/limits")
    LimitConfiguration retrieveLimitsConfiguration() {
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }
}
