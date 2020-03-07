package com.yaorange.tqt.service;

import com.yaorange.tqt.pojo.TeaCourse;

import java.util.List;

/**
 * @author:zjj
 * @date 2020/3/6 14:48
 * @description:
 */
public interface CourseService {
    TeaCourse findCoursesById(Long courseId);

    List<TeaCourse> findAll();
}
