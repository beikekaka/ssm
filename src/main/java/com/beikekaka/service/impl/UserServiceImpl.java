package com.beikekaka.service.impl;

import com.beikekaka.dao.IUserDao;
import com.beikekaka.model.User;
import com.beikekaka.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

}
