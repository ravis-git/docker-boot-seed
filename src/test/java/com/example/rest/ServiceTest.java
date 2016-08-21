package com.example.rest;

import com.example.ApplicationStatus;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by ravipalakodeti on 8/21/16.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ServiceTest {

    @Autowired
    Service service;

    @Test
    public void hello() throws Exception {
        ApplicationStatus status = service.hello();
        assertNotNull("Application Status returned by the service",status);
        assertEquals("Application id returned by the service", status.getId(), 123);
    }

}