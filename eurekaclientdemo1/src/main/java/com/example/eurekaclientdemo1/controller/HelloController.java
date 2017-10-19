package com.example.eurekaclientdemo1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/")
    public String hello() {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        return instance.getHost() + ":" + instance.getPort();
    }
}
