package com.example.backend.service;

import com.example.backend.entity.User;
import com.example.backend.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Creating an User
    public User createUser(User user) { return userRepository.save(user); }

    // Reading Users
    public List<User> getAllUsers() { return userRepository.findAll(); }
    public User getUserById(Long id) { return userRepository.findById(id).orElse(null); }

    // Updating an User
    public User updateUser(User updatedUser) { return userRepository.save(updatedUser); }

    // Deleting an User
    public void deleteUser(Long id) { userRepository.deleteById(id); }

}
