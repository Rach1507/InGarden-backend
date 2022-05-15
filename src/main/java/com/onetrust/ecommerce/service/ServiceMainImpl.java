package com.onetrust.ecommerce.service;

import com.onetrust.ecommerce.models.CartItem;
import com.onetrust.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ServiceMainImpl implements ServiceMain {

    @Autowired
    UserRepository userRepository;

//    @Override
//    public boolean addProduct(int uid, CartItem cartItem) {
//
//        return userRepository.getById(uid).getCart_items().add(cartItem);
//
//    }
//
//
//    @Override
//    public void deleteProd(int uid, Long pid) {
//        List<CartItem> cartItems = userRepository.getById(uid).getCart_items();
//
//        cartItems.removeIf(cartItem -> Objects.equals(cartItem.getProduct().getProd_id(), pid));
//
//    }
//
//    @Override
//    public List<CartItem> getCartItems(int uid) {
//
//        return userRepository.getById(uid).getCart_items();
//
//
//    }
}
