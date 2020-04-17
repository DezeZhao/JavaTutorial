package JavaAdvance.Collection_Reflect.DemoIterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
java.util.Iterator 接口 迭代器 对集合进行遍历

常用方法：
       1 boolean hasNExt() 如果有元素可以迭代就返回true
         判断集合中还有么有写一个元素 you就返回true ，没有就返回false

       2 E next() 返回迭代的下一个元素
         取出集合中下一个元素

      Iterator迭代器是一个接口 无法直接使用  必须使用Collection接口中的实现类 获取实现方式比较特殊
      Collection 接口有个一方法 叫iterator 返回迭代器实现类对象
      Iterator<E> iterator() 返回在此Collection的元素上进行迭代的迭代器

       迭代器的使用步骤(重点):
        1.使用集合中的方法iterator()获取迭代器的实现类对象,使用Iterator接口接收(多态)
        2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
        3.使用Iterator接口中的方法next取出集合中的下一个元素
 */
public class Iterator1 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> coll = new ArrayList<>();
        coll.add("kobe");
        coll.add("jordan");
        coll.add("maidi");
        coll.add("paul");
        coll.add("james");

        /*
            1.使用集合中的方法iterator()获取迭代器的实现类对象,使用Iterator接口接收(多态)
            注意:
                Iterator<E>接口也是有泛型的,迭代器的泛型跟着集合走,集合是什么泛型,迭代器就是什么泛型
         */
        Iterator<String> it = coll.iterator();

       /* boolean b1 = it.hasNext();
        System.out.println(b1);
        String s = it.next();
        System.out.println(s);

        b1 = it.hasNext();
        System.out.println(b1);
        s = it.next();
        System.out.println(s);

        b1 = it.hasNext();
        System.out.println(b1);
        s = it.next();
        System.out.println(s);

        b1 = it.hasNext();
        System.out.println(b1);
        s = it.next();
        System.out.println(s);

        b1 = it.hasNext();
        System.out.println(b1);
        s = it.next();
        System.out.println(s);*/
        //使用循环优化  while循环 hasNext()循环结束条件

        while (it.hasNext()) {
            String e = it.next();
            System.out.println(e);
        }

        for (Iterator<String> it2 = coll.iterator(); it2.hasNext(); ) {
            String e = it2.next();
            System.out.println(e);
        }
        //增强for循环
        for (String e : coll) {
            System.out.println(e);
        }

    }

}
