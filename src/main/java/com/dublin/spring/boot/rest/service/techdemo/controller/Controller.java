package com.dublin.spring.boot.rest.service.techdemo.controller;

import com.dublin.spring.boot.rest.service.techdemo.model.User;
import com.dublin.spring.boot.rest.service.techdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    private final UserService userService;

    @Autowired
    public Controller(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/hello")
    public ResponseEntity<String> HelloWorld() {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

    @PostMapping("/add/user")
    public ResponseEntity<HttpStatus> AddUser(@RequestBody User user) {

        userService.addUser(user);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> GetUser(@PathVariable String id) {

        userService.retrieveUser(id);
        return null;

    }

    @PatchMapping("/update/user/")
    public ResponseEntity<HttpStatus> UpdateUser(@RequestBody User updateUser){
        return null; //TODO need to add in logic for this.
    }
}
