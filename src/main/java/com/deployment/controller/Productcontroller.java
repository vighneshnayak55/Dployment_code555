package com.deployment.controller;


import com.deployment.entity.Product;
import com.deployment.service.ProductService;
import com.sun.net.httpserver.HttpsServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class Productcontroller {

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<Product> Hello(@RequestBody() Product prod){
           Product p=productService.createProduct(prod);

           return ResponseEntity.status(HttpStatus.CREATED).body(p);

    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProduct(){

        List<Product> pr=productService.getAllProduct();
        return ResponseEntity.status(HttpStatus.OK).body(pr);

    }
}
