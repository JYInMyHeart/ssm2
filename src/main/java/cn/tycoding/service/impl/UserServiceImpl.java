package cn.tycoding.service.impl;

import cn.tycoding.mapper.UserMapper;
import cn.tycoding.pojo.UserPojo;
import cn.tycoding.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: xck
 * @File: UserServiceImpl
 * @Time: 11:51 2020/4/4
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserMapper userMapper;
    public UserPojo login(UserPojo userPojo) {
        return userMapper.login(userPojo);
    }

    public UserPojo register(UserPojo userPojo) {
        return userMapper.register(userPojo);
    }

    public UserPojo update(UserPojo userPojo) {
        return userMapper.update(userPojo);
    }

    public void logOut(UserPojo userPojo) {

    }

    public boolean delete(UserPojo userPojo) {
        return false;
    }

    public List<UserPojo> selectUser(UserPojo userPojo) {
        return null;
    }
}
