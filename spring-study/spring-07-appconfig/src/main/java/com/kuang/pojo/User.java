package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author Wang Houjun
 * @date 2020/6/25 - $
 */
//这个注解的意思是这个类被Spring接管了，注册到了容器中
@Component
public class User {
    public String name;

    public String getName() {
        return name;
    }
    @Value("qinjiang")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
