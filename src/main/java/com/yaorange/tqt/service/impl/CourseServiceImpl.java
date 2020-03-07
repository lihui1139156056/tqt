package com.yaorange.tqt.service.impl;

import com.yaorange.tqt.mapper.CourseMapper;
import com.yaorange.tqt.pojo.TeaCourse;
import com.yaorange.tqt.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author:zjj
 * @date 2020/3/6 14:48
 * @description:
 */
@Service
@Transactional
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public TeaCourse findCoursesById(Long courseId) {
        TeaCourse course = courseMapper.selectById(courseId);
        return course;
    }

    @Override
    public List<TeaCourse> findAll() {
        List<TeaCourse> teaCourses = courseMapper.selectAll();
        return teaCourses;
    }
}
