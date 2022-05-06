package com.onetrust.ecommerce.service;

import com.onetrust.ecommerce.dto.User;
import com.onetrust.ecommerce.repository.UserRepository;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;





@SpringBootTest
class AdminServiceTest {

    UserRepository userRepository = Mockito.mock(UserRepository.class);


    @Test
    void addUser() {

        AdminServiceImpl adminService = new AdminServiceImpl(userRepository);


//        assertNotNull(userRepository.save().getUid());
User user1 = new User("Rach",
                "Mysore",
                "9898989",
                new ArrayList<>(),
                new ArrayList<>(),
                "rach@gmail.com",
                " 1234",
                "admin");

        User user2 = new User("test",
                "Mysore",
                "9898989",
                new ArrayList<>(),
                new ArrayList<>(),
                "rach@gmail.com",
                " 1234",
                "admin");




            //save user, verify has ID value after save
            assertNull(user1.getUid());
            assertNull(user2.getUid());//null before save

//        adminService.addUser(user1);
//        adminService.addUser(user2);

            assertNotNull(user1.getUid());
            assertNotNull(user2.getUid());
        }
//        @Test
//        public void testFetchData(){
//            /*Test data retrieval*/
//            User userA = userRepository.findByName("Bob");
//            assertNotNull(userA);
//            assertEquals(38, userA.getAge());
//            /*Get all products, list should only have two*/
//            Iterable users = userRepository.findAll();
//            int count = 0;
//            for(User p : users){
//                count++;
//            }
//            assertEquals(count, 2);
//        }
//
//    }

    @Test
    void deleteUser() {


    }
}