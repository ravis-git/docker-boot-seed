package com.example.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.ApplicationStatus;
import org.springframework.stereotype.Component;

/**
 * Created by ravipalakodeti on 8/20/16.
 */
@Component
@Path("/")
public class Service {

    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    public ApplicationStatus hello() {

        return ApplicationStatus.builder()
                .id(123)
                .name("docker-boot-seed")
                .build();
    }
}
