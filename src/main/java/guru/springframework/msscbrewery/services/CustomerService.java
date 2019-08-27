package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerById(UUID customerId);
    CustomerDTO saveNewCustomer(CustomerDTO customerDTO);
    CustomerDTO updateCustomer(UUID customerId, CustomerDTO customerDTO);
    CustomerDTO deleteCustomerById(UUID customerId);
}
