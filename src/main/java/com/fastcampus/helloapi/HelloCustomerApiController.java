package com.fastcampus.helloapi;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloCustomerApiController {
    @PostMapping(value = "/hello/customer")
    public String helloPostCustomer(@RequestBody Customer customer) {
        return "Hello Post " + customer.getName();
    }

    @GetMapping(value = "/hello/customer/{customerId}")
    public String helloCustomer(@PathVariable Long customerId) {
        return "Hello Get PathVariable " + customerId;
    }

    @GetMapping(value = "/hello/customer")
    public String helloCustomerParam(@RequestParam Long customerId) {
        return "Hello Get Request Param " + customerId;
    }
}
