package com.chinasofti.test;

import com.chinasofti.pojo.User1;
import com.chinasofti.pojo.User2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User2Test {
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext-user2.xml");
        User2 user2 = (User2) classPathXmlApplicationContext.getBean("User2");
        System.out.println(user2);
    }
}
