package com.atguigu.controller;

import com.atguigu.entity.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.BindException;
import java.util.List;
import java.util.Map;

/**
 * @ClassName : UserController
 * @Description : 用户处理器  @ResponseBody注解的解析依赖于 springmvc默认是没有对象转换成json的转换器的，需要手动添加jackson依赖
 *                <dependency>
             *       <groupId>com.fasterxml.jackson.core</groupId>
             *       <artifactId>jackson-core</artifactId>
             *       <version>2.11.0</version>
             *     </dependency>
             *     <dependency>
             *       <groupId>com.fasterxml.jackson.core</groupId>
             *       <artifactId>jackson-databind</artifactId>
             *       <version>2.11.0</version>
             *     </dependency>
             *     <dependency>
             *       <groupId>com.fasterxml.jackson.core</groupId>
             *       <artifactId>jackson-annotations</artifactId>
             *       <version>2.11.0</version>
             *     </dependency>
 *                如果不添加jackson的解析包会报如下错误 No converter found for return value of type: class java.util.ArrayList
 *
 *
 * @Author : 20609
 * @Date: 2022/11/20  8:41
 */


@Controller
@RequestMapping("/hello")
public class UserController {
    @Autowired
    private UserService userService;
    @ResponseBody
    @RequestMapping("/ssm/index")
    public List<User> getAllUser(){
        List<User> user = userService.getUser();
        //model.addAttribute("result",user);

        return user;
    }
    @RequestMapping("hello")
    public String HelloController(Map<String,Object> model){
        List<User> user = userService.getUser();
        model.put("result",user);
        return "index";
    }
}
