package com.example.SimpleSpringBootWebApp.controller;

import com.example.SimpleSpringBootWebApp.model.Product;
import com.example.SimpleSpringBootWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts()
    {
        return service.getProducts();
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable int id)
    {
        return service.getProductById(id);
    }

    @PostMapping("/products")
    public String addProduct(@RequestBody Product product)
    {
        service.addProduct(product);
        return "Product "+ product.getId() +" successfully added";
    }

    @PutMapping("/products")
    public String updateProduct(@RequestBody Product product)
    {
        service.updateProduct(product);
        return "Product "+product.getId()+" updated successfully";
    }
}
