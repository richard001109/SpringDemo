package com.chinasofti.test;

import com.chinasofti.pojo.Bean1;
import com.chinasofti.pojo.Bean2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bean2Test {
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext-Bean2.xml");
        Bean2 bean2 = (Bean2) classPathXmlApplicationContext.getBean("Bean2");
        System.out.println(bean2);
    }
}
