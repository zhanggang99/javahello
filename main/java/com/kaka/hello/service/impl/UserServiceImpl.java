package com.kaka.hello.service.impl;

import com.kaka.hello.mapper.UserMappter;
import com.kaka.hello.po.User;
import com.kaka.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMappter userMappter;

    @Override
    @Cacheable(value="UserCache",key="'user.getAllUsers'")
    public List<User> getAllUsers() {
        return userMappter.getAllUsers();
    }

    @Override
    @CacheEvict(value = "UserCache", key = "'user.getAllUsers'")
    public void deleteUser(Integer id) {
        userMappter.delete(id);
        System.out.println("删除了 id 为"+id.toString()+"用户");
    }
}
