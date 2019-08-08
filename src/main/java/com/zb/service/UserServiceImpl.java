package com.zb.service;

import com.zb.dao.UserMapper;
import com.zb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper um;

    @Override
    public Integer addUserByNameAndPwd(User user) {
        return um.addUserByNameAndPwd(user);
    }

    @Override
    public Integer validatePhoneByUser(String phone) {
        return um.validatePhoneByUser(phone);
    }

    @Override
    public User loginUser(User user) {

        return um.loginUser(user);
    }


}
