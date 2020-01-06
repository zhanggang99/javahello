package com.kaka.hello.service;

import com.kaka.hello.po.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void deleteUser(Integer id);
}
