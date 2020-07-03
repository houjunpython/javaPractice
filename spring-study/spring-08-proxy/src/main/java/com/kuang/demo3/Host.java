package com.kuang.demo3;

import com.kuang.demo1.Rent;

/**
 * @Author Wang Houjun
 * @date 2020/6/26 - $
 */
//房东
public class Host implements Rent {
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
