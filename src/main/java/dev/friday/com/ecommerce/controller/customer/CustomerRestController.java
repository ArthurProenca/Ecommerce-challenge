package dev.friday.com.ecommerce.controller.customer;

import dev.friday.com.ecommerce.controller.base.BaseRestController;
import dev.friday.com.ecommerce.entity.dto.CustomerDTO;
import org.springframework.http.ResponseEntity;

/*
* Base interface for customer controller
* */
public interface CustomerRestController extends BaseRestController {
    /*
    * Save a customer by its DTO
    * */
    ResponseEntity<?> saveCustomer(CustomerDTO customerDTO);
    /*
     * Get a customer by its id
     * */
    ResponseEntity<?> getCustomerById(Long id);
    /*
     * Delete a customer by its id
     * */
    ResponseEntity<?> deleteCustomerById(Long id);
    /*
     * Update a customer by its id and a DTO mapping changes
     * */
    ResponseEntity<?> updateCustomerById(Long id, CustomerDTO customerDTO);
}
