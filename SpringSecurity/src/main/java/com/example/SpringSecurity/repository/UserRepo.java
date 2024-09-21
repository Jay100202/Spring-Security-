package com.example.SpringSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringSecurity.model.Users;

public interface UserRepo extends JpaRepository<Users, Integer> {
        
        Users findByUsername(String username);

}
