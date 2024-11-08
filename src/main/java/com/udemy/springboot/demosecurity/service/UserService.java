package com.udemy.springboot.demosecurity.service;

import com.udemy.springboot.demosecurity.entity.User;
import com.udemy.springboot.demosecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final InMemoryUserDetailsManager inMemoryUserDetailsManager;
    private final UserRepository userRepository;

    @Autowired
    public UserService(InMemoryUserDetailsManager inMemoryUserDetailsManager, UserRepository userRepository) {
        this.inMemoryUserDetailsManager = inMemoryUserDetailsManager;
        this.userRepository = userRepository;
    }

    public String registerUser(User user) {
        if (userRepository.findByUsername(user.getUsername()).isPresent()) {
            throw new IllegalArgumentException("Username already exists.");
        }

        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email already exists.");
        }

        // Save user details to the database
        userRepository.save(user);

        // Add user to in-memory authentication (if needed for session)
        UserDetails userDetails = org.springframework.security.core.userdetails.User
                .withUsername(user.getUsername())
                .password("{noop}" + user.getPassword())
                .roles(user.getRole())
                .build();
        inMemoryUserDetailsManager.createUser(userDetails);

        return null;
    }
}