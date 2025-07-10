package com.getuready.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getuready.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}