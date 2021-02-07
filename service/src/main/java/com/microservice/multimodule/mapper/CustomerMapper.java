package com.microservice.multimodule.mapper;

import com.microservice.multimodule.dao.CustomerRepository;
import com.microservice.multimodule.dto.Customer;
import com.microservice.multimodule.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper
public abstract class CustomerMapper {

    public abstract Customer map(CustomerEntity customerEntity);
    public abstract CustomerEntity map( Customer customer);

}
