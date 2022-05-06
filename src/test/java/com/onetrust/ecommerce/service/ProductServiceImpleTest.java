package com.onetrust.ecommerce.service;

import com.onetrust.ecommerce.dto.CartItem;
import com.onetrust.ecommerce.dto.Product;
import com.onetrust.ecommerce.repository.ProductRepository;
import com.onetrust.ecommerce.repository.UserRepository;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductServiceImpleTest {


    @Mock
    ProductRepository productRepository;

    @Autowired
    ProductServiceImple productService;

    @Test
    void createProduct() {





        assertInstanceOf(java.lang.Long.class,productService.createProduct(new Product(

                "Fertilizer",
                "Lorem Epsum ",
                "K ,Mg ,Ca",
                150.0f,
                "https://project-ingarden-images.s3.ap-south-1.amazonaws.com/kari-shea-tcgMBsW4zlU-unsplash.jpg",
                20,
                "1",
                20.5f,
                40.5f))
        );

    }

    @Test
    void getProduct() {

        assertInstanceOf(Product.class,productService.getProduct(2L));


        assertThrows(RuntimeException.class,()-> productService.getProduct(200L));


    }





    @Test
    void deleteProduct() {

        productService.deleteProduct(18L);

        assertThrows(RuntimeException.class,()-> productService.getProduct(19L));
    }

    @Test
    void getAllProducts() {

        assertInstanceOf(Product.class,productService.getAllProducts().get(0));
    }

    @Test
    void updateProduct() {


        productService.updateProduct(18L,new Product(

                "Fertilizer-2",
                "Lorem Epsum ",
                "K ,Mg ,Ca",
                100.0f,
                "https://project-ingarden-images.s3.ap-south-1.amazonaws.com/kari-shea-tcgMBsW4zlU-unsplash.jpg",
                10,
                "1",
                20.5f,
                40.5f));

        assertEquals(productService.getProduct(18L).getProd_name(),"Fertilizer-2");

    }
}