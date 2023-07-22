package org.example.Controller;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class ExecuteJarController {

    private final String completePath = "E:\\Blockchain\\Blockchain-Java\\blockchain\\target\\blockchain-1.0.jar";
    public String executeJar(){
        try{
            ProcessBuilder processBuilder = new ProcessBuilder("java","-jar",completePath);
            processBuilder.start();
            return "JAR execution initiated successfully";
        }
        catch(Exception e){
            e.printStackTrace();
            return "Failed to start server";
        }
    }
}
