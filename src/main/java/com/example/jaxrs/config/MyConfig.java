package com.example.jaxrs.config;

import com.example.jaxrs.JaxRsApplication;
import com.example.jaxrs.Service.CompteRestJaxRSAPI;
import com.example.jaxrs.repository.CompteRepository;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public ResourceConfig resourceConfig() {
        ResourceConfig jersyServlet = new ResourceConfig();
        jersyServlet.register(CompteRestJaxRSAPI.class);
        return jersyServlet;
    }
}
