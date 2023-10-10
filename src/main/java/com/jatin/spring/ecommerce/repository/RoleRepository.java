package com.jatin.spring.ecommerce.repository;

import com.jatin.spring.ecommerce.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;



public interface RoleRepository extends JpaRepository<Role, Integer> {
}
