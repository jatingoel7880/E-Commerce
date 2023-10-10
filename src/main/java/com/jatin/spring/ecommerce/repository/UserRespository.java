package com.jatin.spring.ecommerce.repository;

import com.jatin.spring.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRespository extends JpaRepository<User, Integer> {
    Optional<User> findUserByEmail(String email);
}
