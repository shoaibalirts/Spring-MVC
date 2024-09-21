package com.namenets.WebProject.controller;


import com.namenets.WebProject.model.Product;
import com.namenets.WebProject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @RequestMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }
    @RequestMapping("/products/{prodId}")
    public Product getProdById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }
}
