package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// This annotation instructs Spring to initialize its configuration - which is needed to start a
// new application
@SpringBootApplication
@ComponentScan(basePackages = {"org.example.Service","org.example.Controller"})
public class Main {

    // We can start our application by calling the run method with the primary class
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }


}