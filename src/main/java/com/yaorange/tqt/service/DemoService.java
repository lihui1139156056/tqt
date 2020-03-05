package com.yaorange.tqt.service;

import com.yaorange.tqt.mapper.StudentMapper;
import com.yaorange.tqt.pojo.Student;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
//测试
@Service
@Transactional
public class DemoService {
    @Resource
    private StudentMapper studentMapper;

    public List<Student> findAll() {
        List<Student> students = studentMapper.selectAll();
        return students;
    }

}
