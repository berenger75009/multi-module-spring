package com.microservice.multimodule;

import com.microservice.multimodule.dto.Customer;
import reactor.core.publisher.Mono;

public interface CustomerResource {

    Mono<Customer> addCustomer(Customer customer);
}
