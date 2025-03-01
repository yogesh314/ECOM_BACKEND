package com.yogesh.ECOM_BACKEND.controller;

import com.yogesh.ECOM_BACKEND.model.Product;
import com.yogesh.ECOM_BACKEND.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProduct(){
        //This ResponseEntity is used to send different Http status to client
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }
}
