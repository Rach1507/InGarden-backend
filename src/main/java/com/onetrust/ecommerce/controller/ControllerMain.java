package com.onetrust.ecommerce.controller;

import com.onetrust.ecommerce.dto.CartItem;
import com.onetrust.ecommerce.dto.Order;
import com.onetrust.ecommerce.dto.Product;
import com.onetrust.ecommerce.service.ProductServiceImple;
import com.onetrust.ecommerce.service.ServiceMainImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

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

//    @GetMapping(value = "/{uid}/orders", produces = { "application/hal+json" })
//    public CollectionModel<CartItem> getOrdersForCustomer(@PathVariable final int uId) {
//        List<CartItem> cartItems = serviceMain.getCartItems(uId);
//        for (final CartItem item : cartItems) {
//            Link selfLink = linkTo(methodOn(ControllerMain.class)
//                    .getItemsInCart(uId)).withSelfRel();
//            cartItems.add(selfLink);
//        }
//
//        Link link = linkTo(methodOn(ControllerMain.class)
//                .getOrdersForCustomer(uId)).withSelfRel();
//        CollectionModel<CartItem> result = CollectionModel.of(cartItems, link);
//        return result;
//    }

    @PostMapping("/addProduct")
    public boolean addProduct(@PathVariable("id") int uid, @RequestBody CartItem cartItem) {
        return serviceMain.addProduct(uid, cartItem);
    }

    @DeleteMapping("/cart/{pid}")
    public void deleteProduct(@PathVariable("id") int uid, @PathVariable("pid") Long pid) {
        serviceMain.deleteProd(uid, pid);
    }

    @GetMapping("/cart")
    public List<CartItem> getItemsInCart(@PathVariable("id") int uid) {
        return serviceMain.getCartItems(uid);
    }


    @GetMapping("/allProducts")
    public List<Product> getAllItems() {
        return productService.getAllProducts();
    }
}


//      @GetMapping("/checkout")
//      public void checkout(){
//
//      }