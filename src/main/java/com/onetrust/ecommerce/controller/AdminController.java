package com.onetrust.ecommerce.controller;

import com.onetrust.ecommerce.dto.User;
import com.onetrust.ecommerce.service.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    AdminServiceImpl adminService;

    @GetMapping("/admin/newUser")
   public int addNewUser(){
        return adminService.addUser();
    }



}
