package dev.friday.com.ecommerce.controller.customer.impl;


import dev.friday.com.ecommerce.controller.customer.CustomerRestController;
import dev.friday.com.ecommerce.entity.dto.CustomerDTO;
import dev.friday.com.ecommerce.service.customer.CustomerRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerRestControllerImpl implements CustomerRestController {

    private final CustomerRestService customerRestService;

    @Override
    @PostMapping("/v1/customer")
    public ResponseEntity<?> saveCustomer(@RequestBody CustomerDTO customerDTO) {
        return ResponseEntity.ok(customerRestService.saveUser(customerDTO));
    }

    @Override
    @GetMapping("/v1/customer")
    public ResponseEntity<?> getCustomerById(@RequestParam Long id) {
        return ResponseEntity.ok(customerRestService.getCustomerById(id));
    }

    @Override
    @DeleteMapping("/v1/customer")
    public ResponseEntity<?> deleteCustomerById(@RequestParam Long id) {
        customerRestService.deleteCustomerById(id);
        return ResponseEntity.ok("Customer deleted");
    }

    @Override
    @PutMapping("/v1/customer")
    public ResponseEntity<?> updateCustomerById(@RequestParam Long id, @RequestBody CustomerDTO customerDTO) {
        return ResponseEntity.ok(customerRestService.updateCustomerById(id, customerDTO));
    }

    @Autowired
    public CustomerRestControllerImpl(CustomerRestService customerRestService) {
        this.customerRestService = customerRestService;
    }
}
