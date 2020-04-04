package cn.tycoding.controller;

import cn.tycoding.pojo.Admin;
import cn.tycoding.pojo.UserPojo;
import cn.tycoding.service.UserService;
import cn.tycoding.util.ResponseVO;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xck
 * @File: UserController
 * @Time: 0:30 2020/4/4
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * 登录功能
     */
    @RequestMapping(value = "/login")
    public ResponseVO login(@RequestBody UserPojo userPojo, HttpSession session) {
        UserPojo result = userService.login(userPojo);
        if (result != null) {
            if (result.getPassword().equals(userPojo.getPassword())) {
                session.setAttribute("name", userPojo.getName());
                return ResponseVO.success(result);
            } else {
                return ResponseVO.failed(result);
            }
        } else {
            return ResponseVO.failed("");
        }
    }

    /**
     * 注册功能
     */
    @RequestMapping(value = "/register")
    public String register(@RequestBody UserPojo userPojo, HttpSession session) {
        userService.register(admin);
        session.setAttribute("name", admin.getA_name());
        return "view/page";
    }
}
