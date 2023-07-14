package org.example;

import org.example.Controller.InitiateUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.example.Controller"})
public class Main {


    public static void main(String[] args)throws Exception {
        SpringApplication.run(Main.class, args);
        InitiateUserService initiateUserService = new InitiateUserService();
        initiateUserService.newUserRegistration();
    }
}