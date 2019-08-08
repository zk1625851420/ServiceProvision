package com.zb.service;

import com.zb.entity.User;

public interface UserService {
    /**
     * 根据姓名和密码注册用户
     * @param user 对象
     * @return 受影响的行数
     */
    Integer addUserByNameAndPwd(User user);

    /**
     * 验证用户名是否存在
     * @param phone 手机号
     * @return 受影响的行数
     */
    Integer  validatePhoneByUser(String phone);
    /**
     * 登录用户
     * @param user 获取的值
     * @return 返回受影响的行数
     */
     User loginUser(User user);

}
