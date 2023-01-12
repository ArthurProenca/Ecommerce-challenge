package dev.friday.com.ecommerce.service.customer.impl;

import dev.friday.com.ecommerce.entity.dto.CustomerDTO;
import dev.friday.com.ecommerce.entity.model.Customer;
import dev.friday.com.ecommerce.entity.model.User;
import dev.friday.com.ecommerce.repository.customer.CustomerRepository;
import dev.friday.com.ecommerce.service.customer.CustomerRestService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerRestServiceImpl implements CustomerRestService {
    private final CustomerRepository customerRepository;

    /*
        Save a customer by its DTO using CustomerBuilder and jpa repository
     */
    @Override
    public Customer saveUser(CustomerDTO customerDTO) {
        return customerRepository.save(Customer.builder().
                email(customerDTO.getEmail()).
                cpf(customerDTO.getCpf()).
                user(new User(customerDTO.getName(), customerDTO.getPassword(), customerDTO.getIsAdmin())).
                build());
    }

    /*
     * Get a customer by its id using jpa repository
     * */
    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElseThrow();
    }

    /*
     * Delete a customer by its ID using jpa repository
     * */
    @Override
    public void deleteCustomerById(Long id) {
        customerRepository.deleteById(id);
    }

    /*
     * Update a customer by its id and dto using jpa repository
     * */
    @Override
    public Customer updateCustomerById(Long id, CustomerDTO customerDTO) {
        customerRepository.findById(id).map(customer -> {
            BeanUtils.copyProperties(customerDTO, customer);
            return customerRepository.save(customer);
        }).orElseThrow(() -> new RuntimeException("Customer not found"));
        return null;
    }

    /*
     * IMPORTANT: This constructor injects the interface CustomerRepository into class, initializing it
     * The autowired annotation is important to tell JVM how bean should inject itself
     * */
    @Autowired
    public CustomerRestServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
