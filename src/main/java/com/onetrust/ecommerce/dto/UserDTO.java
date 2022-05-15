package com.onetrust.ecommerce.dto;

import com.onetrust.ecommerce.models.CartItem;
import com.onetrust.ecommerce.models.Order;

import javax.persistence.OneToMany;
import java.util.List;

public class UserDTO {
    public UserDTO(int uid, String u_name, String u_address, String u_phone, String u_email, String user_permission) {
        this.uid = uid;
        this.u_name = u_name;
        this.u_address = u_address;
        this.u_phone = u_phone;
        this.u_email = u_email;
        this.user_permission = user_permission;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
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

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }

    public String getUser_permission() {
        return user_permission;
    }

    public void setUser_permission(String user_permission) {
        this.user_permission = user_permission;
    }

    private int uid;
    private String u_name;
    private String u_address;
    private String u_phone;

    private String u_email;

    private String user_permission;

}