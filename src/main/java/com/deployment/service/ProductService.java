package com.deployment.service;


import com.deployment.entity.Product;
import com.deployment.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepo productRepo;

    @Autowired
    public ProductService(ProductRepo productRepo){
        this.productRepo=productRepo;
    }



    public Product createProduct(Product product){
       Product product1= productRepo.save(product);
       return product1;
    }

    public List<Product> getAllProduct() {

        List<Product> products=productRepo.findAll();
        return products;
    }
}
