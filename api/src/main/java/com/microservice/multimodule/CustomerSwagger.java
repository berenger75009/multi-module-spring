package com.microservice.multimodule;

import com.microservice.multimodule.dto.Customer;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import reactor.core.publisher.Mono;

@Component
public interface CustomerSwagger extends CustomerResource {

    @Override
    @PostMapping
    Mono<Customer> addCustomer(Customer customer);
}
