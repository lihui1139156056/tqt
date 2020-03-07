package com.yaorange.tqt.controller;

import com.yaorange.tqt.pojo.User;
import com.yaorange.tqt.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author:zjj
 * @date 2020/3/6 11:10
 * @description:
 */
@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    /**
     * 查询所有老师
     * @return
     */
    @RequestMapping("/teachers")
    @GetMapping
    public List<User> queryAllTeachers(){
       return userService.findAllTeacers();
    }


    @GetMapping("/info")
    public Boolean getInfo(@RequestParam("access_token") String token){
        return true;
    }


}
