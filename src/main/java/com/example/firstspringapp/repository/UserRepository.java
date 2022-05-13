package com.example.firstspringapp.repository;

import com.example.firstspringapp.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User> getAll();

    Integer create(User user);

    Integer update(User user , Integer id);

    Integer delete(Integer id);

    Optional<User> getById(Integer id);


}
