package com.odds.repository;

import org.springframework.data.repository.CrudRepository;

import com.odds.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByEmail(String email);
}
