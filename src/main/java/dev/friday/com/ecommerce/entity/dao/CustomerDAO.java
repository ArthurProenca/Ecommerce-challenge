package dev.friday.com.ecommerce.entity.dao;

import dev.friday.com.ecommerce.entity.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDAO extends UserDAO {
    private String email;
    private String cpf;

}
