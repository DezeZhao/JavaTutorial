package com.test;

import java.awt.print.Pageable;

public class Person {
    private int age;
    private String name;
    private int id;

    static String room;//属于该类
    private static int idCounter;//每当new新对象的时候，计数器加1

    //静态代码块用于对静态成员变量赋值 在第一次使用该类的时候就调用
    //比如构造本类的时候
    static {
        idCounter = 0;
        room = "101 ROM";
    }

    public Person(){
        System.out.println(room);
        System.out.println(age);
    }

    public static void printS(){
        System.out.println(room);//静态方法可以访问静态属性
        System.out.println(idCounter);
        //System.out.println(age);//静态方法不能访问非静态属性
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        this.id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
