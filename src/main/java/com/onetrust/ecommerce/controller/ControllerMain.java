package com.onetrust.ecommerce.controller;

import com.onetrust.ecommerce.models.CartItem;
import com.onetrust.ecommerce.models.Product;
import com.onetrust.ecommerce.service.ProductServiceImple;
import com.onetrust.ecommerce.service.ServiceMainImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@RestController

@RequestMapping("/users/{id}")
public class ControllerMain {

    @Autowired
    ServiceMainImpl serviceMain;

    @Autowired
    ProductServiceImple productService;


    @GetMapping("/echo/{echo}")
    public String healthCheck(@PathVariable("echo") final String echo) {
        return echo + " from mainController";
    }


//
//    @PostMapping("/addProduct")
//    public boolean addProduct(@PathVariable("id") int uid, @RequestBody CartItem cartItem) {
//        return serviceMain.addProduct(uid, cartItem);
//    }
//
//    @DeleteMapping("/cart/{pid}")
//    public void deleteProduct(@PathVariable("id") int uid, @PathVariable("pid") Long pid) {
//        serviceMain.deleteProd(uid, pid);
//    }
//
//    @GetMapping("/cart")
//    public List<CartItem> getItemsInCart(@PathVariable("id") int uid) {
//        return serviceMain.getCartItems(uid);
//    }


    @GetMapping("/allProducts")
    public List<Product> getAllItems() {
        return productService.getAllProducts();
    }
}

