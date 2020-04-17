package JavaAdvance.Collection_Generic.DemoGeneric;

import java.util.ArrayList;
import java.util.Collections;

/*
    斗地主综合案例:
        1.准备牌
        2.洗牌
        3.发牌
        4.看牌
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //准备牌
        //定义一个存储54张牌的ArrayList集合，泛型使用String
        ArrayList<String> poker = new ArrayList<>();

        //定义两个数组 一个存放花色  一个存放序号
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        //先把大小王存放poker中
        poker.add("大王");
        poker.add("小王");
        //组装52张牌
        for (String number : numbers) {
            for (String color : colors) {
                poker.add(color + number);
            }
        }

        //洗牌
        //使用集合的工具类Collections中方法
        //static void shuffle(List<?> list) 使用默认随机方法对指定列表进行置换
        Collections.shuffle(poker);

        //发牌
        //定义4个集合 存储玩家的牌
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        //遍历poker集合 存储玩家的牌和底牌
        //当poker集合的索引模3给三个玩家发牌
        //剩余三张牌给底牌
        //i>=51 发给底牌

        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if (i >= 51) {
                dipai.add(p);
            } else if (i % 3 == 0) {
                p1.add(p);
            } else if (i % 3 == 1) {
                p2.add(p);
            } else {
                p3.add(p);
            }
        }
        //看牌 输出即可
        System.out.println("player1:" + p1);
        System.out.println("player2:" + p2);
        System.out.println("player3:" + p3);
        System.out.println("dipai:" + dipai);

    }


}
