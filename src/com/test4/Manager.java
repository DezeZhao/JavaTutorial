package com.test4;

import java.util.ArrayList;

public class Manager  extends User{
    public Manager() {
    }

    public Manager(int money, String name) {
        super(money, name);
    }

    public ArrayList<Integer> send(int totalMoney,int count){
        //存储若干个红包的金额
        ArrayList<Integer> list = new ArrayList<>();

        int leftMoney = super.getMoney();//群主当前余额

        if (totalMoney > leftMoney){
            System.out.println("余额不足");
            return list;
        }

        super.setMoney(leftMoney-totalMoney);

        int avg = totalMoney/count;

        int mod = totalMoney % count;
        for (int i = 0; i < count - 1; i++) {
            list.add(avg);
        }
        //零头放到最后一个红包里面
        int last = avg + mod;
        list.add(last);
        return list;
    }
}
