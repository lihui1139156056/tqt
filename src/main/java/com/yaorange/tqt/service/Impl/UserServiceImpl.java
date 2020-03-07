package com.yaorange.tqt.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yaorange.tqt.mapper.UserMapper;
import com.yaorange.tqt.mapper.UserInfoMapper;
import com.yaorange.tqt.pojo.User;
import com.yaorange.tqt.pojo.UserInfo;
import com.yaorange.tqt.service.UserService;
import com.yaorange.tqt.utils.PageResult;
import com.yaorange.tqt.vo.SeachUser;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public PageResult<User> pageUser(Integer pageNo,Integer pageSize,SeachUser seachUser) {

        PageHelper.startPage(pageNo, pageSize);
        List<User> sysUsers = new ArrayList<User>();
        if(seachUser.getClassId() == null && seachUser.getStuName().equals("")){
            //不做搜索查询全部用户
            sysUsers = userMapper.selectAll();
        }else if(seachUser.getClassId() != null && seachUser.getStuName().equals("")){
            //根据班级查询
            User sysUser = new User();
            sysUser.setClassId(seachUser.getClassId());
            sysUsers = userMapper.select(sysUser);
        }else if(seachUser.getClassId() == null && !seachUser.getStuName().equals("")){
            //根据用户名查询
            UserInfo sysUserInfo = new UserInfo();
            sysUserInfo.setName(seachUser.getStuName());
            List<UserInfo> select = userInfoMapper.select(sysUserInfo);
            for(UserInfo userInfo:select){
                   User sysUser = userMapper.selectByPrimaryKey(userInfo.getUserId());
                   sysUser.setUserInfo(userInfo);
                   sysUsers.add(sysUser);
            }
        }else {
            //根据班级和名字查询
            UserInfo sysUserInfo = new UserInfo();
            sysUserInfo.setName(seachUser.getStuName());
            List<UserInfo> select = userInfoMapper.select(sysUserInfo);
            for(UserInfo userInfo:select){
                User sysUser = userMapper.selectByPrimaryKey(userInfo.getUserId());
                sysUser.setUserInfo(userInfo);
                if(sysUser.getClassId() == seachUser.getClassId()){
                    //存在
                    sysUsers.add(sysUser);
                }
            }
        }
        if(sysUsers.size()>=1){
            for (User user:sysUsers) {
                Example example = new Example(UserInfo.class);
                Example.Criteria criteria = example.createCriteria();
                criteria.andEqualTo("userId",user.getUserId());
                UserInfo sysUserInfo1 = userInfoMapper.selectOneByExample(example);
                user.setUserInfo(sysUserInfo1);
            }
            PageResult<User> result = new PageResult<>();
            PageInfo<User> pageInfo = new PageInfo<>(sysUsers);
            result.setTotal(pageInfo.getTotal());
            result.setItems(pageInfo.getList());
            result.setNumber(Long.valueOf(pageInfo.getPageNum()));
            result.setTotalPage(Long.valueOf(pageInfo.getPages()));
            return result;
        }
        return null;
    }

    @Override
    public User checkUsername(String userName) {
        User sysUser = new User();
        sysUser.setUserName(userName);
        return userMapper.selectOne(sysUser);
    }

    @Override
    public void addUser(User sysUser) {
        userMapper.insert(sysUser);
        UserInfo userInfo = sysUser.getUserInfo();
        User sysUser1 = userMapper.selectOne(sysUser);
        userInfo.setUserId(sysUser1.getUserId());
        userInfoMapper.insert(userInfo);
    }

    @Override
    public void updateUser(User sysUser) {
        userMapper.updateByPrimaryKey(sysUser);
        userInfoMapper.updateByPrimaryKeySelective(sysUser.getUserInfo());
    }

    @Override
    public void deleteUser(String[] userIds) {
        for(String userId:userIds){
            //根据Id查找到userInfo
            Example example = new Example(UserInfo.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("userId",Integer.valueOf(userId));
            UserInfo sysUserInfo = userInfoMapper.selectOneByExample(example);
            userInfoMapper.delete(sysUserInfo);
            userMapper.deleteByPrimaryKey(userId);
        }

    }
}
