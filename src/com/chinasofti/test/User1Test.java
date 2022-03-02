package com.chinasofti.test;

import com.chinasofti.pojo.User1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User1Test {
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext-user1.xml");
        User1 user1 = (User1) classPathXmlApplicationContext.getBean("User1");
        System.out.println(user1);

    }
}
