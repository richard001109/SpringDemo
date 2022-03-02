package com.chinasofti.controller;

import com.chinasofti.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        //调用UserService实例中的方法
        //1.加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取UserService对象
        UserService userService =(UserService) context.getBean("userService");
        //3.调用登陆的方法
        boolean isLogin = userService.login("richard","123456");
        //4.判断
        if (isLogin){
            System.out.println("登录成功");
        }else {
            System.out.println("登陆失败");
        }
    }
}
