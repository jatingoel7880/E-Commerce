package com.jatin.spring.ecommerce.repository;

import com.jatin.spring.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByCategory_Id(int id);
    //give the name then jpa automatically creates the methods
}
