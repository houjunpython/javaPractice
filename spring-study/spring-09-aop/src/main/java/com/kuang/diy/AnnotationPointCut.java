package com.kuang.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Author Wang Houjun
 * @date 2020/6/29 - $
 */
@Aspect //注解这个类是一个切面
public class AnnotationPointCut {
    @Before("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public void before(){
    System.out.println("======方法执行前========");
    }
    @After("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("==========方法执行后============");
    }
    //在环绕增强中，可以给定一个参数，代表我们获取处理切入的点
    @Around("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public void arround(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        Object proceed =jp.proceed();       //执行方法
        System.out.println("环绕后");
        Signature signature=jp.getSignature();//获得签名
        System.out.println("signature:"+signature);
        System.out.println(proceed);
    }
}
