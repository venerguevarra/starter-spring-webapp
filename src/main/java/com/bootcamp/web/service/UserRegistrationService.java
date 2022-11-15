package com.bootcamp.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.web.entity.User;
import com.bootcamp.web.repository.UserRepository;

@Service
public class UserRegistrationService {
    @Autowired
    private UserRepository userRepository;

    public void register(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }

        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new RuntimeException("Email address taken.");
        }

        userRepository.save(user);
    }
}
