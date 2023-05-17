package com.example.customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService{
    private CustomerRepository customerRepository;

    public void registerCustomer(CustomerRegistrationRequest customerRegistrationRequest){
        Customer customer = Customer.builder()
                .firstName(customerRegistrationRequest.firstName())
                .lastName(customerRegistrationRequest.lastName())
                .email(customerRegistrationRequest.email())
                .build();
        customerRepository.save(customer);
    }

}
