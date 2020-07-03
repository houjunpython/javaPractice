package com.kuang.pojo;

import javax.naming.Name;

/**
 * @Author Wang Houjun
 * @date 2020/6/23 - $
 */
public class User {
    public String name;
    public String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
