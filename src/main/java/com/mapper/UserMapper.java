package com.mapper;

import base.TkMapper;
import com.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface UserMapper extends TkMapper<User> {

    List<User> getAllUser();
}
