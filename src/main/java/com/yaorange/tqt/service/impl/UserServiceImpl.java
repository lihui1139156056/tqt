package com.yaorange.tqt.service.impl;

import com.yaorange.tqt.mapper.UserInfoMapper;
import com.yaorange.tqt.mapper.UserMapper;
import com.yaorange.tqt.pojo.User;
import com.yaorange.tqt.pojo.UserInfo;
import com.yaorange.tqt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author:zjj
 * @date 2020/3/6 11:15
 * @description:
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<User> findAllTeacers() {
        List<User> users = userMapper.selectTeachers();
        users.forEach(user -> {
            UserInfo userInfo = userInfoMapper.selectByUserId(user.getUserId());
            user.setUserInfo(userInfo);
        });
        return users;
    }

    @Override
    public String findNameByUserId(long userId) {

        return userInfoMapper.selectByUserId(userId).getName();
    }
}
