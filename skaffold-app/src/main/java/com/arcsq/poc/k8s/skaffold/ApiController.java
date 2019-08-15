package com.arcsq.poc.k8s.skaffold;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Calendar;

@RestController
public class ApiController {

    @GetMapping("/devices")
    public String getDate() {
        RestTemplate restTemplate = new RestTemplate();
        String resourceUrl
                = "http://skaffold-service:8090/device-info/device1";
        ResponseEntity<String> responseDevice
                = restTemplate.getForEntity(resourceUrl, String.class);

        resourceUrl
                = "http://skaffold-service:8090/device-data/device1";
        ResponseEntity<String> responseData
                = restTemplate.getForEntity(resourceUrl, String.class);

        return "Time of Request - " + Calendar.getInstance().getTime().toString() + "<br>Device Information - " + responseDevice.getBody() + "<br>Device Data - " + responseData.getBody();


    }

}
