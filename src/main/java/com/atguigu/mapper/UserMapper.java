package com.atguigu.mapper;

import com.atguigu.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName : UserMapper
 * @Description : UserMapper
 * @Author : 20609
 * @Date: 2022/11/20  8:09
 */
@Repository
public interface UserMapper {

    User getUser(@Param("userId") Integer userId);

    List<User> getAllUser();

}
