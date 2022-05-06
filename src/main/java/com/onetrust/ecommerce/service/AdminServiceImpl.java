package com.onetrust.ecommerce.service;

import com.onetrust.ecommerce.dto.User;
import com.onetrust.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class AdminServiceImpl implements AdminService {

    public AdminServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    UserRepository userRepository;

    @Override
    public int addUser() {

     return userRepository.save(new User("Rach",
                "Mysore",
                "9898989",
                new ArrayList<>(),
                new ArrayList<>(),
                "rach@gmail.com",
                " 1234",
                "admin")).getUid();
    }

    @Override
    public Long deleteUser() {
        return null;
    }
}
