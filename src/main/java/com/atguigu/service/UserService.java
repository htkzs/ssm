package com.atguigu.service;

import com.atguigu.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    public List<User> getUser();
}
