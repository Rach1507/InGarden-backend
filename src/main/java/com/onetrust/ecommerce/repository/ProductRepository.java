package com.onetrust.ecommerce.repository;

import com.onetrust.ecommerce.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "SELECT * FROM PRODUCT WHERE category_id = :category_id",nativeQuery = true)
    public List<Product> getProductByCategoryId(@Param("category_id") String category_id);


}
