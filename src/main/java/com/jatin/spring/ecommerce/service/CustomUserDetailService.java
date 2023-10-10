package com.jatin.spring.ecommerce.service;

import com.jatin.spring.ecommerce.model.User;
import com.jatin.spring.ecommerce.model.CustomUserDetail;
import com.jatin.spring.ecommerce.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    UserRespository userRespository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
      Optional<User> user= userRespository.findUserByEmail(email);
      //take out the object and return it
      user.orElseThrow(()->new UsernameNotFoundException("User not found"));
        return user.map(CustomUserDetail::new).get();
    }
}
