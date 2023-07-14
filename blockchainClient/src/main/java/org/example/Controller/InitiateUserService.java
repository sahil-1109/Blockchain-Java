package org.example.Controller;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import javax.sound.midi.Soundbank;
import java.io.IOException;
@Service
public class InitiateUserService {

    private String url;
    private void callUserRegistration(String action) throws Exception{

        CloseableHttpClient httpClient = HttpClients.createDefault();
        url = "http://localhost:8080/" + action;

        HttpGet httpGet = new HttpGet(url);

        try{
            HttpResponse response = httpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();
            String responseMessage = EntityUtils.toString(entity);
            System.out.println(responseMessage);
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
    public void newUserRegistration() throws Exception{
        callUserRegistration("new-user");
    }
}
