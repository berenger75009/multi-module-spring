package com.microservice.multimodule.service;

import com.microservice.multimodule.dao.CustomerRepository;
import com.microservice.multimodule.dto.Customer;
import com.microservice.multimodule.entity.CustomerEntity;
import com.microservice.multimodule.mapper.CustomerMapper;
import reactor.core.publisher.Mono;

public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper){
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    public Mono<Customer> addCustomer(Customer customer){
        CustomerEntity entity = customerMapper.map(customer);
        return customerRepository.save(entity).map(customerMapper::map);
    }

}
