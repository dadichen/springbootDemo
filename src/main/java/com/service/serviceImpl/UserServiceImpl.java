package com.service.serviceImpl;

import com.mapper.UserMapper;
import com.po.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserMapper userMapper;

    @Override
    public User selectById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> selectAll(){
        return userMapper.getAllUser();
    }
}
