package JavaAdvance.List_Set.DemoSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    java.util.Set接口 extends Collection接口
    Set接口的特点:
        1.不允许存储重复的元素
        2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历
    java.util.HashSet集合 implements Set接口
    HashSet特点:
         1.不允许存储重复的元素
         2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历
         3.是一个无序的集合,存储元素和取出元素的顺序有可能不一致
         4.底层是一个哈希表结构(查询的速度非常的快)
 */
/*
    HashSet存储元素的不重复原理要了解
    先计算hashCode,若相等，再根据equals方法比较两个对象是否相等，若相等则不存储，否则进行存储
    HashSet-->数组+链表/红黑树
 */
/*
    HashSet存储自定义类型元素
    set集合报错元素唯一:
        存储的元素(String,Integer,...Student,Person...),必须重写hashCode方法和equals方法

    要求:
        同名同年龄的人,视为同一个人,只能存储一次
 */
public class HashSet1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //add添加元素
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(2);

        //迭代遍历
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            Object i = it.next();
            System.out.println(i);
        }
        System.out.println("=============================");
        //foreach 遍历
        for (Integer i : set) {
            System.out.println(i);
        }

        System.out.println("================================");

        HashSet<String> h1 = new HashSet<>();
        String s1 = "abc";
        String s2 = "abc";

        h1.add("通话");
        h1.add("重地");
        h1.add("abc");

        System.out.println(h1);
        System.out.println("================================");

        Person p1 = new Person(21, "zdz");
        Person p2 = new Person(12, "zdz");
        Person p3 = new Person(21, "zdz");

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());

        System.out.println(p1 == p3);//false
        System.out.println(p1.equals(p3));//true
        //两个对象地址不一样  但内容equals

    }
}
