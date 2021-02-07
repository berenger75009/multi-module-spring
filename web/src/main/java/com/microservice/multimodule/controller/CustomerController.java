package com.microservice.multimodule.controller;

import com.microservice.multimodule.CustomerSwagger;
import com.microservice.multimodule.dto.Customer;
import com.microservice.multimodule.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class CustomerController implements CustomerSwagger {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @Override
    public Mono<Customer> addCustomer(Customer customer) {
        return customerService.addCustomer(customer);
    }
}
