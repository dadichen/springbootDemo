package com.service;

import com.po.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public interface UserService {
    User selectById(Integer id);

    List<User> selectAll();
}
