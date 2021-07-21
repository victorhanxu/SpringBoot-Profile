package com.github.victorhanxu.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Configuration
public class MyWebApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println("MyWebApplicationInitializer------------------->onStartup");
        servletContext.setInitParameter("spring.profiles.active", "qa1");
    }
}