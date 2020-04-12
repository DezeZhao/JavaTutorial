package com.test2;

public class Student extends Person{
    int num=10;

    @Override
    public void method(){
        super.method();//调用父类方法
        System.out.println("子类方法");
        int num=30;
        System.out.println(num);//30
        System.out.println(this.num);//10
        System.out.println(super.num);//20

    }

}
