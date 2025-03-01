package com.yogesh.ECOM_BACKEND.repo;

import com.yogesh.ECOM_BACKEND.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
