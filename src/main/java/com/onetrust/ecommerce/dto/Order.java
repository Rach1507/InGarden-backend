package com.onetrust.ecommerce.dto;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Entity
public class Order {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;

    @OneToMany(targetEntity = CartItem.class,cascade = ALL)
    @JoinColumn(name="cart_items",referencedColumnName = "order_id")
    private List<CartItem> cart_items;

    @ManyToOne
    @JoinColumn(name="user")
    private User user;

    public int getOrder_id() {
        return order_id;
    }


    public List<CartItem> getCart_items() {
        return cart_items;
    }

    public void setCart_items(List<CartItem> cart_items) {
        this.cart_items = cart_items;
    }
}
