package com.odds.service;

import org.springframework.stereotype.Service;

import com.odds.model.User;
import com.odds.repository.UserRepository;

@Service
public class UserService {

    private UserRepository userRepository;

    public User findByEmail(String email){
        return userRepository.findByEmail(email);
    }
}