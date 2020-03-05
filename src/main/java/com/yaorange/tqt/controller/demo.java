package com.yaorange.tqt.controller;

import com.yaorange.tqt.pojo.Student;
import com.yaorange.tqt.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
//测试
@RestController
@RequestMapping("/demo")
public class demo {
    @Resource
    private DemoService demoService;

    @GetMapping("/student")
    public List<Student> findAllStudent(){
        return demoService.findAll();
    }
}
