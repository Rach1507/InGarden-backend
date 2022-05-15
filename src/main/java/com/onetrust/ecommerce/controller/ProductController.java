package com.onetrust.ecommerce.controller;

import com.onetrust.ecommerce.models.Product;
import com.onetrust.ecommerce.service.ProductServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

  @PostMapping("/add")
    public Long addProduct(@RequestBody Product product){
        return productService.createProduct(product);
  }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable("id")  Long id ,@RequestBody Product product){

        return productService.updateProduct(id,product);
    }

    @GetMapping("/categories/{id}")
    public List<Product> getProductsByCategory(@PathVariable("id") String cat_id){
        return  productService.getProductByCategory(cat_id);
    }

}
