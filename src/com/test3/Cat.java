package com.test3;

public  class Cat extends Animal{

    public Cat(){
        System.out.println("子类构造方法");
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("猫睡觉");
    }
}
