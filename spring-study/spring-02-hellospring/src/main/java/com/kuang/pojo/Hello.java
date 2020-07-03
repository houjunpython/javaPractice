package com.kuang.pojo;

/**
 * @Author Wang Houjun
 * @date 2020/6/19 - $
 */
public class Hello {
    public  String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
