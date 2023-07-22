package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

// This annotation instructs Spring to initialize its configuration - which is needed to start a
// new application
@SpringBootApplication
@RestController
@ComponentScan(basePackages = {"org.example.Service","org.example.Controller"})
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @PostMapping("shut-down")
    public void shutdown() {
        SpringApplication.exit(SpringApplication.run(Main.class));

    }

}