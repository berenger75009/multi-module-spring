package com.microservice.multimodule.dao;

import com.microservice.multimodule.entity.CustomerEntity;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface CustomerRepository extends ReactiveCrudRepository<CustomerEntity, Long> {

    @Query("SELECT * FROM customer WHERE last_name = :lastname")
    Flux<CustomerEntity> findByLastName(String lastName);

}
