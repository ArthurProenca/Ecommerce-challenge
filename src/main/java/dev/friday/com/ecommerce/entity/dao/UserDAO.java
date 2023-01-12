package dev.friday.com.ecommerce.entity.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDAO {
    private String name;
    private String password;
    private Boolean isAdmin;
}
