package JavaAdvance.OBJ_API.DemoObject;

import java.util.Objects;

public class Equals {
    public static void main(String[] args) {
       /*
        Person类默认继承了Object类,所以可以使用Object类的equals方法
            boolean equals(Object obj) 指示其他某个对象是否与此对象“相等”。
        */
        Person p1 = new Person(21, "zdz");
        Person p2 = new Person(21, "zdz");
        //Person p2 = new Person(22, "dzz");

        System.out.println(p1.equals(p2));
        //p2 = p1;
        System.out.println(p1.equals(p2));

        //引用类型 比较地址值
        //基本数据类型 比较值

        String s1 = null;
        String s2 = "acs";
        //可以容忍空指针
        /*
        public static boolean equals(Object a, Object b) {
            return (a == b) || (a != null && a.equals(b));
        }
         */
        boolean b = Objects.equals(s1, s2);
        System.out.println(b);
        //s1.equals(s2);//不能容忍空指针，空指针不能够调用函数


    }

}
