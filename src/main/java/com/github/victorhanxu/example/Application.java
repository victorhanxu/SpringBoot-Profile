package com.github.victorhanxu.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.ConfigurableEnvironment;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Arrays;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {



    public static void main(String[] args) {
        //Works!!
        //System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "qa1,dev,prod,aaa,bbb,ttt");

        SpringApplication.run(Application.class, args);
    }

    /*@Override // !! Not working for this method to set active profile
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "production");
        super.onStartup(servletContext);
    }*/


    /*@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }*/

}