package com.kuang.service;

import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoMysqlImpl;
import com.kuang.dao.UserDaoOracleImpl;

/**
 * @Author Wang Houjun
 * @date 2020/6/19 - $
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao;
    //利用set实现动态值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser(){
        userDao.getUser();
    }
}
