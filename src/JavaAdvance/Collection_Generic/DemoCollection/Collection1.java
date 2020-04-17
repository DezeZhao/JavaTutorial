package JavaAdvance.Collection_Generic.DemoCollection;

import java.util.ArrayList;
import java.util.Collection;

/*
 java.util.Collection接口
        所有单列集合的最顶层的接口,里边定义了所有单列集合共性的方法
        任意的单列集合都可以使用Collection接口中的方法

  共性方法有：
    public boolean add(E e) ： 把给定的对象添加到当前集合中 。
    public void clear() :清空集合中所有的元素。
    public boolean remove(E e) : 把给定的对象在当前集合中删除。
    public boolean contains(E e) : 判断当前集合中是否包含给定的对象。
    public boolean isEmpty() : 判断当前集合是否为空。
    public int size() : 返回集合中元素的个数。
    public Object[] toArray() : 把集合中的元素，存储到数组中。

 */
public class Collection1 {
    public static void main(String[] args) {
        //创建集合对象  多态的方法创建
        Collection<String> coll = new ArrayList<>();
        //collection重写了toString方法

        boolean b1 = coll.add("张三");
        coll.add("lisi");
        coll.add("wangwu");
        System.out.println("b1 = " + b1);

        boolean b2 = coll.remove("zhaosi");
        System.out.println("b2=" + b2);

        boolean b3 = coll.contains("张三");
        System.out.println("b3=" + b3);

        boolean b4 = coll.isEmpty();
        System.out.println("b4=" + b4);

        int size_ = coll.size();
        System.out.println("size=" + size_);

        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        coll.clear();
        System.out.println(coll);

    }
}
