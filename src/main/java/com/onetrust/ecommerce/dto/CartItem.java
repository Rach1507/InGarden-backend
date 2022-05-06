package com.onetrust.ecommerce.dto;

import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;

@Entity
public class CartItem {

    public Integer getCart_item_id() {
        return cart_item_id;
    }

    public void setCart_item_id(Integer cart_item_id) {
        this.cart_item_id = cart_item_id;
    }

    public Integer getProd_quantity() {
        return prod_quantity;
    }

    public void setProd_quantity(Integer prod_quantity) {
        this.prod_quantity = prod_quantity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cart_item_id;

    @OneToOne
    @JoinColumn(name = "product")
    @RestResource(path = "cartItemProduct", rel="product")
    private Product product;

    private Integer prod_quantity;

    @ManyToOne
    @JoinColumn(name="ordered_by_user")
    private User user;

    public CartItem() {
    }

    public CartItem( Product product, Integer count) {
        this.product = product;

        this.prod_quantity = count;
    }




    public Integer getCount() {
        return prod_quantity;
    }

    public void setCount(Integer count) {
        this.prod_quantity = count;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
