package com.example.service;

import com.example.BaseTest.BaseApplicationTests;
import com.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceTest extends BaseApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void testAll(){
        Assert.assertSame("用户数量有错",2,userService.selectAll().size());
    }

}
