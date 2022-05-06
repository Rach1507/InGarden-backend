package com.onetrust.ecommerce.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.awt.*;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int category_id;
    private String category_name;
    private String category_desc;
//    private byte[] category_img;

    public int getCategory_id() {
        return category_id;
    }



    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getCategory_desc() {
        return category_desc;
    }

    public void setCategory_desc(String category_desc) {
        this.category_desc = category_desc;
    }

//    public byte[] getCategory_img() {
//        return category_img;
//    }
//
//    public void setCategory_img(byte[] category_img) {
//        this.category_img = category_img;
//    }
}
