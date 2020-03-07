package com.yaorange.tqt.service;

import com.yaorange.tqt.pojo.User;

import java.util.List;

/**
 * @author:zjj
 * @date 2020/3/6 11:14
 * @description:
 */
public interface UserService {
    List<User> findAllTeacers();

    String findNameByUserId(long userId);
}
