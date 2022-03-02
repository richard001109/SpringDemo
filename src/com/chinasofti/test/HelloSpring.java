package com.chinasofti.test;

public class HelloSpring {
    //姓名
    private String username;
    public  void setUsername(String username){
        this.username = username;
    }
    //输出显示信息的方法
    public void show(){
        System.out.println(username+"说，hello Spring");
    }
}
