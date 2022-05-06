package com.onetrust.ecommerce.service;

import com.onetrust.ecommerce.dto.Product;

import java.util.List;

public interface ProductService {


        Long createProduct(Product product);

        Product getProduct(Long id);

        void deleteProduct(Long id);

        List<Product> getAllProducts();

        Product updateProduct(Long id, Product product);
    }

