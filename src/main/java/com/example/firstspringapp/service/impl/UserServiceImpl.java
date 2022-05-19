package com.example.firstspringapp.service.impl;


import com.example.firstspringapp.model.User;
import com.example.firstspringapp.repository.UserRepository;
import com.example.firstspringapp.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<User> getAll() {
        log.info("IN UserServiceImpl getAll() get all users");
        return userRepository.getAll();
    }

    @Override
    public Integer create(User user) {
        log.info("IN UserServiceImpl create() create nurse: {}", user);
        return userRepository.create(user);
    }

    @Override
    public Integer update(User user, Integer id) {
        log.info("IN UserServiceImpl update() update user: {}", user);
        return userRepository.update(user, id);
    }

    @Override
    public Integer delete(Integer id) {
        log.info("IN UserServiceImpl delete() delete user with id: {}", id);
        return userRepository.delete(id);
    }

    @Override
    public Optional<User> getById(Integer id) {
        log.info("IN UserServiceImpl getById() find user by id: {}", id);
        return Optional.empty();
    }
}
