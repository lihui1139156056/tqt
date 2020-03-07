package com.yaorange.tqt.controller;

import com.yaorange.tqt.pojo.TeaCourse;
import com.yaorange.tqt.service.impl.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author:zjj
 * @date 2020/3/6 15:03
 * @description:
 */
@RestController
@RequestMapping("/api/course")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class CourseController {

    @Autowired
    private CourseServiceImpl courseService;

    @GetMapping("/all")
    public List<TeaCourse> queryAllCourse(){
       return courseService.findAll();
    }
}
