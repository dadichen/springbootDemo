package com.controller;

import com.po.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping("/selectAll")
    public List<User> selectAll(){
        List<User> userList = userService.selectAll();
        return userList;
    }


}
