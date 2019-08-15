package com.arcsq.poc.k8s.skaffold.skaffoldservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScaffoldServiceController {

    @GetMapping("/device-info/{deviceId}")
    public String getDeviceInfo(@PathVariable("deviceId") String deviceId) {
        return deviceId + " - Description of the device";
    }

    @GetMapping("/device-data/{deviceId}")
    public String getDeviceData(@PathVariable("deviceId") String deviceId) {
        return deviceId + "[10, 20, 30, 40, 50]";
    }

}
