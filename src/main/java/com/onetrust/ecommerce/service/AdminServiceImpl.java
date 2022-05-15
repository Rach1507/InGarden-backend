package com.onetrust.ecommerce.service;

import com.onetrust.ecommerce.dto.UserDTO;
import com.onetrust.ecommerce.models.User;
import com.onetrust.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    public AdminServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    UserRepository userRepository;

    @Override
    public int addUser(UserDTO userDTO) {


        User newUser =
                new User(
                        userDTO.getU_name(),
                        userDTO.getU_address(),
                        userDTO.getU_phone(),
                        userDTO.getU_email(),
                        userDTO.getUser_permission()
                );

        return userRepository.save(newUser).getUid();

    }


    @Override
    public List<UserDTO> getUsers() {

        List<User> users = userRepository.findAll();

        List<UserDTO> userDtos = new ArrayList<>();


        for (User user : users) {
            userDtos.add(new UserDTO(
                    user.getUid(),
                    user.getU_name(),
                    user.getU_address(),
                    user.getU_phone(),
                    user.getU_email(),
                    user.getUser_permission()));
        }
        return userDtos;

    }
}
