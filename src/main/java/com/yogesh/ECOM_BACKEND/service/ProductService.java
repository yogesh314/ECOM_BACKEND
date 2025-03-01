package com.yogesh.ECOM_BACKEND.service;

import com.yogesh.ECOM_BACKEND.model.Product;
import com.yogesh.ECOM_BACKEND.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
}
