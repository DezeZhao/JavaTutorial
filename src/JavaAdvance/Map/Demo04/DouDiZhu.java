package JavaAdvance.Map.Demo04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
    斗地主综合案例:有序版本
    1.准备牌
    2.洗牌
    3.发牌
    4.排序
    5.看牌
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //定义Map集合存储牌的索引 及 组装好的牌
        HashMap<Integer, String> poker = new HashMap<>();
        //创建一个List集合用于存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();

        //定义两个List存储花色 和 牌序号
        //这种添加数据的方法定义List的时候只能用这种方法 不可用ArrayList定义
        List<String> colors = List.of("♠", "♥", "♣", "♦");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        //存储大小王在poker 中
        poker.put(0, "大王");
        pokerIndex.add(0);
        poker.put(1, "小王");
        pokerIndex.add(1);

        int index = 2;
        //组装牌
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index, color + number);
                pokerIndex.add(index);
                index++;
            }
        }
//        System.out.println(poker);
//        System.out.println(pokerIndex);

        //2. 洗牌    使用Collections中的方法shuffle(List)
        Collections.shuffle(pokerIndex);

        //3. 发牌
        //定义4个集合,存储玩家牌的索引,和底牌的索引
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ArrayList<Integer> p3 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();

        //遍历poker集合 存储玩家的牌和底牌
        //当poker集合的索引模3给三个玩家发牌
        //剩余三张牌给底牌
        //i>=51 发给底牌

        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer p = pokerIndex.get(i);
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

        /*
            4.排序
            使用Collections中的方法sort(List)
            默认是升序排序
         */

        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(dipai);

        /*
            5.看牌
            定义方法
         */
        lookPoker("p1", poker, p1);
        lookPoker("p2", poker, p2);
        lookPoker("p3", poker, p3);
        lookPoker("dipai", poker, dipai);

    }

    public static void lookPoker(String name, HashMap<Integer, String> poker, ArrayList<Integer> p) {
        if (p == null) {
            return;
        }
        System.out.print(name + ":");
        for (Integer index : p) {
            String s = poker.get(index);
            System.out.print(s + " ");
        }
        System.out.println();//每个玩家之后打印换行
    }
}
