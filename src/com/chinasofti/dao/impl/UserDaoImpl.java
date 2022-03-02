package com.chinasofti.dao.impl;

import com.chinasofti.dao.UserDao;

/*
数据接口层实现类
实现UserDao接口，并重写接口中的为实现的方法
 */
public class UserDaoImpl implements UserDao {
    @Override
    public boolean login(String username, String password) {
        //模拟数据库查询的操作
        if (username.equals("richard") && password.equals("123456")) {
            return true;
        } else {
            return false;
        }
    }
}
