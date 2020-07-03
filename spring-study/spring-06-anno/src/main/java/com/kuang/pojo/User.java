package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author Wang Houjun
 * @date 2020/6/24 - $
 */
@Component
@Scope("prototype")
public class User {
    //相当于<property name="name" value="狂神"/>
    @Value("狂神")
    public String name;
}
