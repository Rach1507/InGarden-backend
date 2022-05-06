package com.onetrust.ecommerce.controller;

import com.onetrust.ecommerce.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
@WebMvcTest(controllers = AdminController.class)
class AdminControllerTest {

    @MockBean
    UserRepository userRepository;

    @Test
    void addNewUser() {




    }
}