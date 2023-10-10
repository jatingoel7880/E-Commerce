package com.jatin.spring.ecommerce.repository;

import com.jatin.spring.ecommerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
