package cn.tycoding.mapper;

import cn.tycoding.pojo.UserPojo;
import java.util.List;

/**
 * @Author: xck
 * @File: UserDao
 * @Time: 11:31 2020/4/4
 */
public interface UserMapper {

    UserPojo login(UserPojo userPojo);
    UserPojo register(UserPojo userPojo);
    UserPojo update(UserPojo userPojo);
    void logOut(UserPojo userPojo);
    boolean delete(UserPojo userPojo);
    List<UserPojo> selectUser(UserPojo userPojo);

}
