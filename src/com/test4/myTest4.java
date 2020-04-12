package com.test4;

import java.util.ArrayList;

public class myTest4 {
    public static void main(String[] args) {
        //创建群主
        Manager manager = new Manager(100, "群主");

        //创建成员
        Member m1 = new Member(0, "成员1");
        Member m2 = new Member(3, "成员2");
        Member m3 = new Member(10, "成员3");

        manager.show();//群主有多少钱 叫啥名

        m1.show();
        m2.show();
        m3.show();

        System.out.println("===========================");

        //发红包
        ArrayList<Integer> list = manager.send(10,3);
        System.out.print("成员1:");
        m1.receive(list);
        m1.show();
        System.out.print("成员2:");
        m2.receive(list);
        m2.show();
        System.out.print("成员3:");
        m3.receive(list);
        m3.show();

        //show
        manager.show();



    }

}
