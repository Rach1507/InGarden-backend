package com.onetrust.ecommerce.controller;

import com.onetrust.ecommerce.dto.Product;
import com.onetrust.ecommerce.service.ProductServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductServiceImple productService;

    @GetMapping("/echo/{echo}")
    public String healthCheck(@PathVariable("echo") final String echo) {
        return echo + " from ProductController";
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") Long id){
        return productService.getProduct(id);
    }

   @DeleteMapping("/{id}")  
    public void deleteProduct(@PathVariable("id") Long pid){
        productService.deleteProduct(pid);
   }
//
  @PostMapping("/add")
    public Long addProduct(@RequestBody Product product){
        return productService.createProduct(product);
  }
//
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable("id")  Long id ,@RequestBody Product product){

        return productService.updateProduct(id,product);
    }

}
