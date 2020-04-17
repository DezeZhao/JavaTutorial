package JavaAdvance.List_Set.DemoList;

import java.util.LinkedList;

/*
    java.util.LinkedList集合 implements List接口
    LinkedList集合的特点:
        1.底层是一个链表结构:查询慢,增删快
        2.里边包含了大量操作首尾元素的方法
        注意:使用LinkedList集合特有的方法,不能使用多态

        - public void addFirst(E e):将指定元素插入此列表的开头。
        - public void addLast(E e):将指定元素添加到此列表的结尾。
        - public void push(E e):将元素推入此列表所表示的堆栈。

        - public E getFirst():返回此列表的第一个元素。
        - public E getLast():返回此列表的最后一个元素。

        - public E removeFirst():移除并返回此列表的第一个元素。
        - public E removeLast():移除并返回此列表的最后一个元素。
        - public E pop():从此列表所表示的堆栈处弹出一个元素。

        - public boolean isEmpty()：如果列表不包含元素，则返回true。

 */
/*
    addFirst addLast push
    getFirst getLast
    removeFirst removeLast
 */
public class LinkedList1 {
    public static void main(String[] args) {
        //注意此处不能用多态的方法创建对象
        LinkedList<String> linked = new LinkedList<>();//创建linkedlist对象
        //add放啊添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
        System.out.println(linked);

        //addfirst
        linked.addFirst("first_add");
        linked.push("first_push");//等效上
        System.out.println(linked);
        System.out.println("=============================");

        //get
        if (!linked.isEmpty()) {
            String first = linked.getFirst();
            String last = linked.getLast();
            System.out.println(first);
            System.out.println(last);
        }
        System.out.println(linked);
        System.out.println("=============================");

        //remove
        if (!linked.isEmpty()) {
            String e = linked.remove(0);
            System.out.println(e);
            System.out.println(linked);
            e = linked.remove(1);
            System.out.println(e);
            System.out.println(linked);
            e = linked.pop();//remove first
            System.out.println(linked);
        }

        System.out.println("=============================");

    }
}
