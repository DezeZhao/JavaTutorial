package com.test3;

/*
抽象类  抽象方法所在的类必须是抽象类
如何使用抽象方法和抽象类：
1. 不能直接创建抽象类 new
2. 必须用一个子类来继承抽象类
3. 子类必须重写抽象父类中的所有抽象方法
【覆盖重写 override】
4. 创建子类对象使用

抽象累不一定有抽象方法
但抽象方法必定在抽象类

非抽象子类继承抽象父类则必须在非抽象子类中重写所有抽象方法
否则编译器会报错；
要想不重写所有父类方法，则可以将该类必须为抽象类
 */
public abstract class Animal {
    //抽象方法
    //内容不确定
    public Animal() {
        System.out.println("抽象父类的构造方法");
    }

    public abstract void eat();

    public abstract void sleep();

    //正常方法
    public void normalMethod() {

    }
}
