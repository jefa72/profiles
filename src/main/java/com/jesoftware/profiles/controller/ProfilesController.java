package com.jesoftware.profiles.controller;

import com.jesoftware.profiles.dao.ConnectionProperty;
import com.jesoftware.profiles.service.DevService;
import com.jesoftware.profiles.service.ProdService;
import com.jesoftware.profiles.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfilesController {


    @Autowired
    DevService devService;

    @Autowired
    TestService testService;

    @Autowired
    ProdService prodService;

    @Autowired
    private Environment environment;

    @RequestMapping("/api/connectors")
    public ConnectionProperty getConnectionProperty() {

        String[] activeProfiles = this.environment.getActiveProfiles();

        switch (activeProfiles[0]) {
            case "dev":
                return new ConnectionProperty(devService.getEnv(), devService.getHost(), devService.getUserName(), devService.getPassword());
            case "test":
                return new ConnectionProperty(testService.getEnv(), testService.getHost(), testService.getUserName(), testService.getPassword());
            default:
                return new ConnectionProperty(prodService.getEnv(), prodService.getHost(), prodService.getUserName(), prodService.getPassword());

        }
    }
}
