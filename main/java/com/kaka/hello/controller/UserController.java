package com.kaka.hello.controller;

import com.kaka.hello.po.User;
import com.kaka.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/userList")
    public List<User> getAllUsers(){
        List<User> list = this.userService.getAllUsers();
        System.out.println("查到用户数："+list.size());
        return list;
    }

    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        this.userService.deleteUser(id);
    }
}
