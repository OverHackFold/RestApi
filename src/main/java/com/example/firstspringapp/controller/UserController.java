package com.example.firstspringapp.controller;

import com.example.firstspringapp.model.User;
import com.example.firstspringapp.service.UserService;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<User> getUsers() {
        return userService.getAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Integer createUser(@RequestBody User user) {
        return userService.create(user);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping(value = "/{id}")
    public Integer updateUser(@RequestBody User user, @PathVariable Integer id) {
        return userService.update(user, id);
    }
}
