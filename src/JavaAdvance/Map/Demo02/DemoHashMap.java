package JavaAdvance.Map.Demo02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    HashMap存储自定义类型键值
    Map集合保证key是唯一的:
        作为key的元素,必须重写hashCode和equals方法,以保证key唯一
 */
public class DemoHashMap {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    /*
            HashMap存储自定义类型键值
            key:String类型
                String类重写hashCode方法和equals方法,可以保证key唯一
            value:Person类型
                value可以重复(同名同年龄的人视为同一个)
    */
    public static void demo01() {
        HashMap<String, Person> map = new HashMap<>();
        //添加元素
        map.put("beijing", new Person("张三", 23));
        map.put("nanjing", new Person("赵六", 24));
        map.put("shanghai", new Person("王五", 21));
        map.put("chongqin", new Person("李四", 22));

        //遍历循环
        Set<String> set = map.keySet();

        for (String s : set) {
            Person v = map.get(s);
            System.out.println(v);
        }

    }

    /*
        HashMap存储自定义类型键值
        key:Person类型
            【Person类就必须重写hashCode方法和equals方法,以保证key唯一】
        value:String类型
            可以重复
     */
    public static void demo02() {
        Map<Person, String> map = new HashMap<>();

        map.put(new Person("queen", 18), "England");
        map.put(new Person("pujin", 54), "Russia");
        map.put(new Person("queen", 18), "China");
        map.put(new Person("Trump", 70), "USA");

        //entryset遍历
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String v = entry.getValue();
            System.out.println(key + ":" + v);
        }
        /*
        Person{name='Trump', age=70}:USA
        Person{name='queen', age=18}:China //被替换
        Person{name='pujin', age=54}:Russia
        */


    }

}
