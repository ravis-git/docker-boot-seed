package com.example.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Created by ravipalakodeti on 8/20/16.
 */
@Component
@ApplicationPath("/docker-boot")
public class RestConfig extends ResourceConfig {

    public RestConfig() {
        packages("com.example.rest");
    }
}
