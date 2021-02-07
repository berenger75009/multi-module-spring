package com.microservice.multimodule.service;

import com.microservice.multimodule.dto.Customer;
import com.microservice.multimodule.entity.CustomerEntity;
import reactor.core.publisher.Mono;

public interface CustomerService {

    Mono<Customer> addCustomer(Customer customer);
}
