package com.onetrust.ecommerce.dto;

import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "users")
public class User  {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;
    private String u_name;
    private String u_address;
    private String u_phone;

    @OneToMany(mappedBy = "user")
    private List<CartItem> cart_items;

    @OneToMany(mappedBy = "user")
    private List<Order> order_history;

    private String u_email;
    private String u_password;
    private String user_permission;




    public User(String u_name, String u_address, String u_phone, List<CartItem> cart_items, List<Order> order_history, String u_email, String u_password, String user_permission) {

        this.u_name = u_name;
        this.u_address = u_address;
        this.u_phone = u_phone;
        this.cart_items = cart_items;
        this.order_history = order_history;
        this.u_email = u_email;
        this.u_password = u_password;
        this.user_permission = user_permission;
    }




    public List<Order> getOrder_history() {
        return order_history;
    }

    public void setOrder_history(List<Order> order_history) {
        this.order_history = order_history;
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    public String getUser_permission() {
        return user_permission;
    }

    void setUser_permission(String user_permission) {
        this.user_permission = user_permission;
    }


    public String getEmail() {
        return u_email;
    }

    public void setEmail(String email) {
        u_email = email;
    }


    public User() {
    }

    public User(String uname, String uaddress, String uphone, List<CartItem> car_items) {
        u_name = uname;
        u_address = uaddress;
        u_phone = uphone;
//        this.cart_items = car_items;
    }

    public int getUid() {
        return uid;
    }


    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_address() {
        return u_address;
    }

    public void setU_address(String u_address) {
        this.u_address = u_address;
    }

    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone;
    }

    public List<CartItem> getCart_items() {
        return cart_items;
    }

    public void setCart_items(List<CartItem> cart_items) {
        this.cart_items = cart_items;
    }


}
