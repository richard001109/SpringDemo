package com.chinasofti.dao;
/*
数据访问接口层
 */
public interface UserDao {
    //登录
    public boolean login(String username,String password);

}
