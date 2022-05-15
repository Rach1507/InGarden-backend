package com.onetrust.ecommerce.controller;

import com.onetrust.ecommerce.dto.UserDTO;
import com.onetrust.ecommerce.service.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class AdminController {

    @Autowired
    AdminServiceImpl adminService;

    @PostMapping("/users/add")
   public int addNewUser(@RequestBody UserDTO userDTO){
        return adminService.addUser(userDTO);
    }


    @GetMapping("/users")
    public List<UserDTO> getUsers(){
        return adminService.getUsers();
}


}
