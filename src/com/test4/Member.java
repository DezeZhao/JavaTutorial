package com.test4;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(int money, String name) {
        super(money, name);
    }

    public void receive(ArrayList<Integer> list) {
        int index = new Random().nextInt(list.size());
        //成员收到多少钱
        int delta = list.remove(index);
        System.out.println("我收到了"+delta+"元钱");
        //当前成员本来有多少钱
        int money = super.getMoney();
        //加法，重新设置回去
        super.setMoney(delta + money);
    }
}
