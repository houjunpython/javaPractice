package com.kuang.demo1;

/**
 * @Author Wang Houjun
 * @date 2020/6/26 - $
 */
public class Client {
    public static void main(String[] args) {
        //房东要租房子了
        Host host=new Host();
        //代理：中介带房东租房子，但是代理一般会有一些附属操作！
        Proxy proxy=new Proxy(host);
        //不用面对房东，直接找中介即可！
        proxy.rent();
    }
}
