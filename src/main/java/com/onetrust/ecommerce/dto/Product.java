package com.onetrust.ecommerce.dto;



import javax.persistence.*;


@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prod_id;
    private String prod_name;
    private String prod_desc;
    private String prod_care_tip;
    private Float prod_price;
    private String image;
    private Integer units_in_stock;

    public Product(Long prod_id, String prod_name, String prod_desc, String prod_care_tip, Float prod_price, String image, Integer units_in_stock, String category_id, Float plant_height, Float plant_width) {
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.prod_desc = prod_desc;
        this.prod_care_tip = prod_care_tip;
        this.prod_price = prod_price;
        this.image = image;
        this.units_in_stock = units_in_stock;
        this.category_id = category_id;
        this.plant_height = plant_height;
        this.plant_width = plant_width;
    }

    private String category_id;
    private Float plant_height;
    private Float plant_width;


    public Product(  String prod_name, String prod_desc, String prod_care_tip, Float prod_price, String image, Integer units_in_stock, String category_id, Float plant_height, Float plant_width) {

        this.prod_name = prod_name;
        this.prod_desc = prod_desc;
        this.prod_care_tip = prod_care_tip;
        this.prod_price = prod_price;
        this.image = image;
        this.units_in_stock = units_in_stock;
        this.category_id = category_id;
        this.plant_height = plant_height;
        this.plant_width = plant_width;
    }




    public Product() {
    }

    public Float getProd_price() {
        return prod_price;
    }

    public void setProd_price(Float prod_price) {
        this.prod_price = prod_price;
    }

    public String getProd_image() {
        return image;
    }

    public void setProd_image(String image) {
        this.image = image;
    }



    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public String getProd_desc() {
        return prod_desc;
    }

    public void setProd_desc(String prod_desc) {
        this.prod_desc = prod_desc;
    }

    public Float getPrice() {
        return prod_price;
    }

    public void setPrice(Float price) {
        prod_price = price;
    }

    public String getProd_care_tip() {
        return prod_care_tip;
    }

    public void setProd_care_tip(String prod_care_tip) {
        this.prod_care_tip = prod_care_tip;
    }


    public Integer getUnits_in_stock() {
        return units_in_stock;
    }

    public void setUnits_in_stock(Integer units_in_stock) {
        this.units_in_stock = units_in_stock;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public Float getPlant_height() {
        return plant_height;
    }

    public void setPlant_height(Float plant_height) {
        this.plant_height = plant_height;
    }

    public Float getPlant_width() {
        return plant_width;
    }

    public void setPlant_width(Float plant_width) {
        this.plant_width = plant_width;
    }

    public Long getProd_id() {
        return prod_id;
    }
}
