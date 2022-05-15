package com.onetrust.ecommerce.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User  {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;
    private String u_name;
    private String u_address;
    private String u_phone;
    private String u_email;
    private String user_permission;


    public User(String u_name, String u_address, String u_phone, String u_email,  String user_permission) {

        this.u_name = u_name;
        this.u_address = u_address;
        this.u_phone = u_phone;
        this.u_email = u_email;
        this.user_permission = user_permission;
    }





    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }

//    public String getU_password() {
//        return u_password;
//    }
//
//    public void setU_password(String u_password) {
//        this.u_password = u_password;
//    }

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

}















//        private String u_password;
//    @OneToMany(mappedBy = "user")
//    private List<CartItem> cart_items;
//
//    @OneToMany(mappedBy = "user")
//    private List<Order> order_history;

//    public List<CartItem> getCart_items() {
//        return cart_items;
//    }
//
//    public void setCart_items(List<CartItem> cart_items) {
//        this.cart_items = cart_items;
//    }


//    public List<Order> getOrder_history() {
//        return order_history;
//    }
//
//    public void setOrder_history(List<Order> order_history) {
//        this.order_history = order_history;
//    }

