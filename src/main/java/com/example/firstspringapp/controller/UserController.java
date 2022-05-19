package com.example.firstspringapp.controller;

import com.example.firstspringapp.model.User;
import com.example.firstspringapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @ResponseStatus(HttpStatus.OK)
    @PostMapping
    public Integer createUser(@RequestBody User user) {
        return userService.create(user);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping(value = "/{id}")
    public Integer updateUser(@RequestBody User user, @PathVariable Integer id) {
        return userService.update(user, id);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping(value = "/{id}")
    public Integer deleteUser(@PathVariable Integer id) {
        return userService.delete(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{id}")
    public Optional<User> getUserById(@PathVariable Integer id) {
        return userService.getById(id);
    }
}
