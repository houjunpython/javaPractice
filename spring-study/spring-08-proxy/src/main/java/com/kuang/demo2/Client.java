package com.kuang.demo2;

import com.kuang.demo1.Proxy;

/**
 * @Author Wang Houjun
 * @date 2020/6/26 - $
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService=new UserServiceImpl();

        UserServiceProxy proxy=new UserServiceProxy();
        proxy.setUserService(userService);

        proxy.add();
    }
}
