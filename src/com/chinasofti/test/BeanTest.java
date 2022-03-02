package com.chinasofti.test;

import com.chinasofti.pojo.Bean1;
import com.chinasofti.pojo.User2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext-Bean1.xml");
        Bean1 bean1 = (Bean1) classPathXmlApplicationContext.getBean("Bean1");
        System.out.println(bean1);
    }
}
