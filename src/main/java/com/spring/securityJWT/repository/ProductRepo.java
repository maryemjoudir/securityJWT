package com.spring.securityJWT.repository;

import com.spring.securityJWT.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
