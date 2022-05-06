package com.onetrust.ecommerce.repository;

import com.onetrust.ecommerce.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
