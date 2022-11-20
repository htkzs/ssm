package com.atguigu.service;

import com.atguigu.entity.User;
import com.atguigu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName : UserServiceImpl
 * @Description : 用户service
 * @Author : 20609
 * @Date: 2022/11/20  9:40
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUser() {
        return userMapper.getAllUser();
    }
}
