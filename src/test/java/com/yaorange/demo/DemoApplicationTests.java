package com.yaorange.demo;

import com.yaorange.tqt.pojo.Student;
import com.yaorange.tqt.service.DemoService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    private DemoService demoService;
    @Test
    void contextLoads() {
        List<Student> all = demoService.findAll();
        System.out.println(all);
    }

}
