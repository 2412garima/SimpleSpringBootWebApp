package com.example.SimpleSpringBootWebApp.service;

import com.example.SimpleSpringBootWebApp.model.Product;
import com.example.SimpleSpringBootWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products= new ArrayList<>(Arrays.asList(
//            new Product(10,"iphone",60000),
//            new Product(11,"Samsung",50000)
//    ));

    public List<Product> getProducts() {

//        return products;
        return repo.findAll();
    }

    public Product getProductById(int id)
    {
//        return products.stream()
//                .filter(p->p.getId()==id)
//                .findFirst()
//                .get();
        return repo.findById(id).orElse(new Product());
    }

    public void addProduct(Product product)
    {

//        products.add(product);
        repo.save(product);
    }

    public void updateProduct(Product product)
    {
//        for(int i=0;i< products.size();i++)
//        {
//            if(products.get(i).getId()== product.getId())
//            {
//                products.set(i,product);
//            }
//        }

        //save will update if already exists else insert
        repo.save(product);
    }

    public void deleteProduct(int id)
    {
//        for(int i=0;i< products.size();i++)
//        {
//            if(products.get(i).getId()== id)
//            {
//                products.remove(i);
//            }
//        }

        repo.deleteById(id);
    }
}
