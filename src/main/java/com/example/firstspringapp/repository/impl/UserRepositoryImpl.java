package com.example.firstspringapp.repository.impl;

import com.example.firstspringapp.model.User;
import com.example.firstspringapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static final String SQL_GET_ALL_USERS = "SELECT * FROM USERS";
    private static final String SQL_CREATE_USER = "INSERT INTO USERS (username, password, mail, date) values (?,?,?,?)";


    @Override
    public List<User> getAll() {
        return jdbcTemplate.query(SQL_GET_ALL_USERS, BeanPropertyRowMapper.newInstance(User.class));
    }

    @Override
    public Integer create(User user) {
        return jdbcTemplate.update(SQL_CREATE_USER,
                user.getUsername(),
                user.getPassword(),
                user.getMail(),
                user.getDate());
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
        return null;
    }
}
