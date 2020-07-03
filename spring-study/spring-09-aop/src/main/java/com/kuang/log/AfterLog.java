package com.kuang.log;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Author Wang Houjun
 * @date 2020/6/28 - $
 */
public class AfterLog implements AfterReturningAdvice {
    //returnValue;
    public void afterReturning(Object returnValue, Method method, Object[] objects, Object object) throws Throwable {
        System.out.println("执行了"+method.getName()+"返回结果为："+returnValue);
    }
}
