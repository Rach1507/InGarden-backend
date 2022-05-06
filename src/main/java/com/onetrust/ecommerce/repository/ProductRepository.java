package com.onetrust.ecommerce.repository;

import com.onetrust.ecommerce.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
