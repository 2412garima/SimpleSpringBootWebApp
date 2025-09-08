package com.example.SimpleSpringBootWebApp.controller;

import com.example.SimpleSpringBootWebApp.model.Product;
import com.example.SimpleSpringBootWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProducts()
    {
        return service.getProducts();
    }
}
