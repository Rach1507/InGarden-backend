package com.onetrust.ecommerce.service;

import com.onetrust.ecommerce.dto.CartItem;

import java.util.List;

public interface ServiceMain {

    boolean addProduct(int uid, CartItem cartItem);

    void deleteProd(int uid, Long pid);

    List<CartItem> getCartItems(int uid);
}
