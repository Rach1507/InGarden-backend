package com.onetrust.ecommerce.controller;

import com.onetrust.ecommerce.service.ProductServiceImple;
import com.onetrust.ecommerce.service.ServiceMain;
import com.onetrust.ecommerce.service.ServiceMainImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
@WebMvcTest(controllers = ControllerMain.class)
class ControllerMainTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    ServiceMainImpl serviceMain;

    @MockBean
    ProductServiceImple productService;

    @Test
    void healthCheck() {
    }

    @Test
    void addProduct() {
    }

    @Test
    void deleteProduct() {
    }

    @Test
    void getItemsInCart() {
    }

    @Test
    void getAllItems() {
    }
}