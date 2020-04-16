package JavaAdvance.OBJ_API.DemoObject;

import java.util.ArrayList;
import java.util.Random;

/*
java.lang.Object
类Object是类层次结构的根类
每个类（Person Student）都使用Object类作为超类
所有对象（包括数组）都实现类这个方法
 */
public class ToString {
    public static void main(String[] args) {
        /*
        Person类默认继承了Object类,所以可以使用Object类中的toString方法
            String toString() 返回该对象的字符串表示。
         */

        Person p = new Person(21, "赵得泽");
        String s = p.toString();

        System.out.println(s);//JavaAdvance.OBJ_API.DemoObject.Person@b4c966a
        System.out.println(p);//JavaAdvance.OBJ_API.DemoObject.Person@b4c966a
        //直接打印对象的名字其实就是调用对象toString方法

        //看一个类是否重写了toString,直接打印这个类的对象即可,如果没有重写toString方法那么打印的是对象的地址值
        Random r = new Random();
        System.out.println(r);//没有重写toString  java.util.Random@4e50df2e

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);//[1,2] 重写了toString方法


    }
}
