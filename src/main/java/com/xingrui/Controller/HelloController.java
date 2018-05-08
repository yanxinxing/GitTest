package com.xingrui.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yanxinxing
 * @create 2018-05-01 23:15
 * @desc HelloWorld控制器
 **/

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello World!";
    }

    @RequestMapping("/hello1")
    @ResponseBody
    public String hello1(){
        return "Hello World1!";
    }

    @RequestMapping("/hello1")
    @ResponseBody
    public String hello2(){
        return "Hello World2!";
    }
}
