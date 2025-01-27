package com.example.Store.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Store.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
