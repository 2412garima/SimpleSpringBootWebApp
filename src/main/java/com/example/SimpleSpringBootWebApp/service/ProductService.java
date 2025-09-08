package com.example.SimpleSpringBootWebApp.service;

import com.example.SimpleSpringBootWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products= new ArrayList<>(Arrays.asList(
            new Product(10,"iphone",60000),
            new Product(11,"Samsung",50000)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int id)
    {
        return products.stream()
                .filter(p->p.getId()==id)
                .findFirst()
                .get();
    }
}
