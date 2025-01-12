package com.project.BookStore_Backend.service;

import com.project.BookStore_Backend.dao.UserRepo;
import com.project.BookStore_Backend.entity.Notification;
import com.project.BookStore_Backend.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



@Service
public class AccountService {

    @Autowired
    private UserRepo userRepository;

    public ResponseEntity<?> registerUser(User user) {
        if(userRepository.existsByUsername(user.getUsername())) {
            return ResponseEntity.badRequest().body(new Notification("Error: Username is already taken!"));
        }
        if(userRepository.existsByEmail(user.getEmail())) {
            return ResponseEntity.badRequest().body(new Notification("Error: Email is already in use!"));
        }
        userRepository.save(user);
        return ResponseEntity.ok("User registered successfully!");
    }

}
