package com.yaorange.tqt.service;

import com.yaorange.tqt.pojo.User;
import com.yaorange.tqt.utils.PageResult;
import com.yaorange.tqt.vo.SeachUser;

public interface UserService {
    PageResult<User> pageUser(Integer pageNo, Integer pageSize, SeachUser seachUser);

    User checkUsername(String userName);

    void addUser(User sysUser);

    void updateUser(User sysUser);

    void deleteUser(String[] userIds);
}
