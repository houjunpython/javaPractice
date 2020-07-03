package com.kuang.demo4;

import com.kuang.demo2.UserService;
import com.kuang.demo2.UserServiceImpl;

import java.lang.reflect.InvocationHandler;

/**
 * @Author Wang Houjun
 * @date 2020/6/27 - $
 */
public class Client2 {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService=new UserServiceImpl();
        //代理角色，不存在
        ProxyInvocationHandler pih=new ProxyInvocationHandler();
        //设置要代理的对象
        pih.setTarget(userService);
        //动态生成代理类
        UserService proxy=(UserService)pih.getProxy();
        proxy.add();
    }
}
