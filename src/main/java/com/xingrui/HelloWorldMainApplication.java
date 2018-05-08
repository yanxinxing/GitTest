package com.xingrui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yanxinxing
 * @create 2018-05-01 23:12
 * @desc 主程序
 **/

@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        //Spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}

