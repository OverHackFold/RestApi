package com.example.firstspringapp.service.impl;

import com.example.firstspringapp.model.User;
import com.example.firstspringapp.repository.UserRepository;
import com.example.firstspringapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return userRepository.getAll();
    }

    @Override
    public Integer create(User user) {
        return userRepository.create(user);
    }

    @Override
    public Integer update(User user, Integer id) {
        return null;
    }

    @Override
    public Integer delete(Integer id) {
        return null;
    }

    @Override
    public Optional<User> getById(Integer id) {
        return Optional.empty();
    }
}
