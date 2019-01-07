package com.dublin.spring.boot.rest.service.techdemo.service;

import com.dublin.spring.boot.rest.service.techdemo.model.User;
import com.dublin.spring.boot.rest.service.techdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public void addUser(User user) {

        userRepository.save(user);
    }

    public Optional<User> retrieveUser(String id) {

        try {
            return userRepository.findById(Long.parseLong(id));
        } catch (Exception e) {
            return null;
        }
    }
}
