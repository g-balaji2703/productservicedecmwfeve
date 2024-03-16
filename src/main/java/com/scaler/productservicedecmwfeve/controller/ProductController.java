package com.scaler.productservicedecmwfeve.controller;

import com.scaler.productservicedecmwfeve.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping() //localhost:8080/products
    public List<Product> getAllProducts(){
        return new ArrayList<>();
    }

    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") Long id){
        return new Product();
    }

    @PostMapping()
    public Product addNewProduct(@RequestBody Product product){
        Product p = new Product();
        p.setTitle("A new Product");
        return p;
    }

    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long id, @RequestBody Product product){
        return new Product();
    }

    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long id, @RequestBody Product product){
        return new Product();
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id){
    }
}
