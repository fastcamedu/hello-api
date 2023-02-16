package com.fastcampus.helloapi;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloApiController {

    @GetMapping(value = "/hello")
    public String helloGet() {
        return "Hello Get";
    }

    @GetMapping(value = "/microservice-hello")
    public String microserviceHelloGet() {
        return "This is Micro Service Hello Get";
    }

    @PostMapping(value = "/hello")
    public String helloPost() {
        return "Hello Post";
    }

    @PutMapping(value = "/hello")
    public String helloPut() {
        return "Hello Put";
    }

    @DeleteMapping(value = "/hello")
    public String helloDelete() {
        return "Hello Delete";
    }
}
