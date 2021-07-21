package com.github.victorhanxu.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Profile("qa1")
public class HelloController {
    @Autowired
    MyService myService;

    @Value("${myusername}")
    String myUsername;

    @Autowired
    private ConfigurableEnvironment env;

    @Autowired
    private Environment environment;

    public void getActiveProfiles() {

        for (String profileName : environment.getActiveProfiles()) {
            System.out.println("Currently active profile - " + profileName);
        }
    }

    @GetMapping("/")
    public String index() {
        myService.printService();
        getActiveProfiles();

        return "username is--->" + myUsername;
    }

}