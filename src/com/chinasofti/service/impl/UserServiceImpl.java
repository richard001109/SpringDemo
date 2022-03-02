package com.chinasofti.service.impl;

import com.chinasofti.dao.UserDao;
import com.chinasofti.dao.impl.UserDaoImpl;
import com.chinasofti.service.UserService;

public class UserServiceImpl  implements UserService {
    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean login(String username, String password) {
        return userDao.login(username,password);
    }
}