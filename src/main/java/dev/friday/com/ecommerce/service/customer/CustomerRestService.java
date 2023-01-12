package dev.friday.com.ecommerce.service.customer;

import dev.friday.com.ecommerce.entity.dto.CustomerDTO;
import dev.friday.com.ecommerce.entity.model.Customer;

public interface CustomerRestService {
    Customer saveUser(CustomerDTO customerDTO);
    Customer getCustomerById(Long id);
    void deleteCustomerById(Long id);

    Customer updateCustomerById(Long id, CustomerDTO customerDTO);
}
