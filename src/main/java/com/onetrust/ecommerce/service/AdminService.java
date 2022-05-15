package com.onetrust.ecommerce.service;

import com.onetrust.ecommerce.dto.UserDTO;

import java.util.List;

public interface AdminService {

     int addUser(UserDTO user);



     List<UserDTO> getUsers();
}
