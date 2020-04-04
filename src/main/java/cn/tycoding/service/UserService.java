package cn.tycoding.service;

import cn.tycoding.pojo.UserPojo;
import cn.tycoding.util.ResponseVO;
import java.util.List;

/**
 * @Author: xck
 * @File: EventService
 * @Time: 0:33 2020/4/4
 */
public interface UserService {
    UserPojo login(UserPojo userPojo);
    UserPojo register(UserPojo userPojo);
    UserPojo update(UserPojo userPojo);
    void logOut(UserPojo userPojo);
    boolean delete(UserPojo userPojo);
    List<UserPojo> selectUser(UserPojo userPojo);


}
