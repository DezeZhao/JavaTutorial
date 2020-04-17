package JavaAdvance.Collection_Generic.DemoCollection;

import JavaAdvance.List_Set.DemoSet.Person;
import JavaAdvance.List_Set.DemoSet.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        - public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素。
        - public static void shuffle(List<?> list) 打乱顺序:打乱集合顺序。
        - public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。
        - public static <T> void sort(List<T> list，Comparator<? super T> ):将集合中元素按照指定规则排序。

    Comparator和Comparable的区别
        Comparable:自己(this)和别人(参数)比较,自己需要实现Comparable接口,重写比较的规则compareTo方法
        Comparator:相当于找一个第三方的裁判,比较两个

    Comparator的排序规则:
        o1-o2:升序


    注意:
         sort(List<T> list)使用前提
         被排序的集合里边存储的元素,必须实现Comparable,重写接口中的方法compareTo定义排序的规则

    Comparable接口的排序规则:
        自己(this)-参数:升序
 */
public class Collections1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //addAll
        Collections.addAll(list, "a", "b", "c", "d", "r");//元素个数不限

        System.out.println(list);

        //shuffle打乱集合中元素
        Collections.shuffle(list);
        System.out.println(list);

        //public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(1);
        list2.add(2);
        Collections.sort(list2);//默认升序
        System.out.println(list2);

        //自定义类型排序
        //重写compareTo方法
        //public static <T> void sort(List<T> list，Comparator<? super T> ):将集合中元素按照指定规则排序。
        ArrayList<Person> list3 = new ArrayList<>();
        list3.add(new Person(21, "张三"));
        list3.add(new Person(19, "赵六"));
        list3.add(new Person(23, "王五"));
        list3.add(new Person(12, "李四"));
        Collections.sort(list3);
        System.out.println(list3);//升序年龄输出
        System.out.println("=====================================");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(3);
        list4.add(2);
        System.out.println(list4);//[1, 3, 2]

        Collections.sort(list4, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;//升序排序
                //o2-o1降序排序
            }
        });

        System.out.println(list4);
        System.out.println("==================================");

        Student stu1 = new Student("杨幂", 23);
        Student stu2 = new Student("a杨幂", 22);
        Student stu3 = new Student("b迪丽热巴", 22);
        Student stu4 = new Student("古力娜扎", 24);


        ArrayList<Student> list5 = new ArrayList<>();
        list5.add(stu1);
        list5.add(stu2);
        list5.add(stu3);
        list5.add(stu4);

        Collections.sort(list5, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //按照年龄升序排列
                int result = o1.getAge() - o2.getAge();
                if (result == 0) {
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                    //System.out.println(result);
                }
                return result;
            }
        });

        System.out.println(list5);

    }
}
