package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author Wang Houjun
 * @date 2020/6/25 - $
 */

@Configuration //这个也会被Spring容器托管，注册到容器中，因为它本来就是一个Component,@Configuration代表这是一个配置类，就和我们之前看的beans.xml一样
@ComponentScan("com.kuang.pojo")
@Import(KuangConfig2.class)
public class KuangConfig {

    //注册一个Bean,就相当于之前写的一个bean标签
    //这个方法的名字就相当于bean标签中的id属性
    //这个方法的返回值，就相当于bean标签中的class属性
    @Bean
    public User getUser(){
        return new User();
    }

}
