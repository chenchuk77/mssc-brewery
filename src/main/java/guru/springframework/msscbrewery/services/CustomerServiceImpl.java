package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        //return null;
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .name("Jon Kon")
                .build();
    }
}
