package dev.friday.com.ecommerce.repository.user;

import dev.friday.com.ecommerce.entity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
