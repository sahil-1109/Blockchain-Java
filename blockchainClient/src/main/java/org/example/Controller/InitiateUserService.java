package org.example.Controller;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
@Service
@RestController
public class InitiateUserService {

    private static final Logger logger = LogManager.getLogger(InitiateUserService.class);
    private String url;
    private void callUserRegistration(String action) throws IOException{

        CloseableHttpClient httpClient = HttpClients.createDefault();
        url = "http://localhost:8080/" + action;

        HttpGet httpGet = new HttpGet(url);

        try{
            HttpResponse response = httpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();
            String responseMessage = EntityUtils.toString(entity);
            logger.info(responseMessage);
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try {
                httpClient.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    @RequestMapping("new-user")
    public void newUserRegistration() throws Exception{
        callUserRegistration("new-user");
    }
    public void intiateServiceServer(){
        ExecuteJarController executeJarController = new ExecuteJarController();
        String response = executeJarController.executeJar();
        logger.info(response);
    }

    public void shutDownServer() throws Exception{
        callUserRegistration("shut-down");
    }
}