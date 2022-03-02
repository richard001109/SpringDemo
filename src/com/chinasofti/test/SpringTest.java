package com.chinasofti.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        //1.加载applicationContext.xml配置文件
        ApplicationContext ApplicationContext =
                //ApplicationContext为ClassPathXmlApplicationContext的父类
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从容器中获取bean实例对象
        HelloSpring helloSpring =(HelloSpring)  ApplicationContext.getBean("helloSpring");
        //3.调用方法
        helloSpring.show();
    }
}
