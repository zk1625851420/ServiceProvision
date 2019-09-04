package com.zb.controller;


import com.zb.entity.User;
import com.zb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController()
public class UserController {

    @Autowired
    UserService us;

    @RequestMapping("/addUserByNameAndPwd")
    public Integer addUserByNameAndPwd(User user){
            return us.addUserByNameAndPwd(user);
    }

    @RequestMapping("/validatePhoneByUser/{phone}")
    public Integer validatePhoneByUser(@PathVariable("phone") String phone){
        return us.validatePhoneByUser(phone);
    }
    @RequestMapping("/loginUser")
    public User loginUser(User user){
        return us.loginUser(user);
    }

    @RequestMapping("/test")
    public String test(){

    }
}
