package com.test;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class myTest {


    public static void main(String[] args) {
        System.out.println("mijiubiuby");
        System.out.printf("char(%c) \n", (char) 65);
        int a;
        int b;
        a = 5;
        b = 5;
        //静态初始化——指定数组内容
        //静态初始化省略格式
        int[] a1 = {1, 2, 3, 4, 4};
        //int [] a1;
        //a1 = {1,2,3,4,5}; 此法错误

        //静态初始化标准格式
        int[] array = new int[]{0, 1, 1, 2, 2, 0, 2, 1, 1};
        int[] array1;
        array1 = new int[]{0, 1, 2, 2, 2, 2, 2};
        for (int value : array1) {
            System.out.println(value);
        }
        for (int value : array1) {
            System.out.print(value);
        }

        //动态初始化
        int[] a3;
        a3 = new int[10];

        //动态初始化——指定数组长度
        int[] a2 = new int[10];//指定数组长度,默认所有元素为0
        System.out.println(a2[1]);

        System.out.println("bcjksdbcjksdb");
        System.out.printf("a+b=%d \n", a + b);
          //键盘输入
//        Scanner sc = new Scanner(System.in);
//        int num  = sc.nextInt();
//        System.out.println(num);
//
//        String str = sc.next();
//        System.out.println(str);
        //生成随机数
//        Random random = new Random();
//        int num = random.nextInt();
//        System.out.println(num);
//
//        int num1 = random.nextInt(3);//[0,3)
//        System.out.println(num1);

        //对象数组
//        Person[] p = new Person[3];
//        System.out.println(p[0]);
        /////////////////////////////////////////////////////////////////////////////////////////
        //ArrayList
//        ArrayList<String> list = new ArrayList<>();
//        ArrayList<String> list1 = new ArrayList<>();
//        System.out.println(list);//[]
//
//        list.add("kobe");
//        list.add("james");
//        list.add("paul");
//        list.add("kawai");
//        System.out.println(list);
//
//        String e1 = list.get(0);//获得指定index的元素
//        System.out.println(e1);
//
//        list.remove(0);//删除指定index的元素
//        System.out.println(list);
//
//        int size = list.size();//获得数组的长度
//        System.out.println(size);
//
//        //遍历数组元素
//        for (String s : list) {
//            System.out.println(s);
//        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        ///////////////////////////////////////////////////////////////////////////////////////////////
        //字符串内容永不改变
        //字符串效果上相当于是char[]字符数组，但是底层原理是byte[]字节数组。
        //String
        String str = new String();//此法可直接用简便方法
        String str1 = "";
        System.out.println(str);

        // 根据字符数组创建字符串
        char[] charArray = {'A', 'B', 'C'};
        String str2 = new String(charArray);
        System.out.println(str2);

        //根据字节数组创建字符串
        byte[] byteArray = {'A', 'B', 'C'};
        String str3 = new String(byteArray);
        System.out.println(str3);

        //字符串常量池：程序中直接写上双引号的字符串，就在字符串常量池中
        //对基本类型来说，==是进行数值比较
        //对引用类型来说，==是进行【地址值】的比较
        String str4 = "ABC";
        System.out.println(str4 == str3);//false
        System.out.println(str4 == str2);//false
        System.out.println(str2 == str3);//false

        //字符串比较方法
        //public boolean equals(Object obj);//obj 可以使任何对象，只有是字符串时并且相同时才会返回布尔值true
        //public boolean equalsIgnoreCase(str);//忽略大小写比较
        /*
         * 1.人核对下那个equals都能接受
         * 2. 如果比较双方一个常量一个变量，推荐叭常量字符串写在前面
         * "abc".equals(str)  str.equals("abs")//当str为null时报错
         *
         * */
        System.out.println(str2.equals(str3));
        System.out.println(str2.equals(str4));
        System.out.println(str4.equals(str3));
        String str5 = "abc";
        System.out.println(str2.equalsIgnoreCase(str5));

        String str6 = "djkfkjfbjvbkj932u42934023";
        int len = str6.length();

        String str7 = str4.concat(str5); //连接字符串
        System.out.println(str7);

        char c = str6.charAt(0);//获取指定索引的单个字符
        System.out.println(c);

        //查找参数字符串在本来字符串中的位置(起始字符位置)
        int index = str7.indexOf(str5);
        System.out.println(index);

        //截取字符串
        /*
        public String substring(int index);//截取参数位置->字符串末尾
        public String substring(int begin ,int end);//[begin,end)
         */
        String s = "HelloWorld";
        System.out.println(s.substring(5));
        System.out.println(s.substring(4, 7));//4,5,6

        // 下面这种写法，字符串的内容仍然是没有改变的
        // 下面有两个字符串："Hello"，"Java"
        // strA当中保存的是地址值。
        // 本来地址值是Hello的0x666，
        // 后来地址值变成了Java的0x999
        String strA = "Hello";
        System.out.println(strA); // Hello
        strA = "Java";
        System.out.println(strA); // Java

        //String 中与转换有关的方法
        /*
         * public char[] toCharArray();将当前字符串拆分为字符数组作为返回值
         * public byte[] getBytes();获得当前字符串底层的字节数组
         * public Stirng replace(Charsequence oldstring ,Cahrsequence newstring);
         * old替换为new
         * */
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);

        byte[] bytes = "abc".getBytes();
        System.out.println(bytes[0]);
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        String s1 = "How do you do?";
        String s2 = s1.replace("o", "*");
        System.out.println(s2);
        System.out.println(s1);//原字符串不变

        //字符串分割
        /*
        split的参数是正则表达式
         */
        String s3 = "aaa,bbb,ccc";
        String[] array2 = s3.split(",");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        String s4 = "aaa.bbb.ccc";
        String[] array3 = s4.split("\\.");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
        ///////////////////////////////////////////////////////////////////////////////////////
        //static关键字
        //多个对象共享同一个数据
        //一旦有了static关键字，那这个数据是【属于类的】，
        //该类的对象共享该数据

        //static修饰成员变量

        Person p1 = new Person(30, "gj");
        Person p2 = new Person(31, "hr");
//        Person.room = "101 room";
        System.out.println(Person.room);
        System.out.println(Person.room);

        System.out.println(p1.getId());
        System.out.println(p2.getId());

        //static 修饰方法情况
        /*
        一旦static修饰了方法就成为了静态方法
        静态方法不属于对象属于类
        静态方法通过对象和类名调用都OK（推荐类名调用）
        static方法不需要创建对象就可调用

        成员方法可以访问静态属性和费静态属性
        静态方法不可直接访问非静态属性

        注意：
        【1】静态只能访问静态，不能访问非静态
        because:在内存中先有静态内容后有静态内容,也就是“后人知道先人。但先人不知道后人”
        【2】静态方法中不能使用this
         */
        Person.printS();

        //静态代码块——当第一次用到本类时，静态代码块执行唯一一次
        //静态代码块优先于构造方法执行
        //【用途】用于一次性对静态成员变量赋值
        /*
        static{
        //静态代码块内容
        }
         */
        /////////////////////////////////////////////////////////////////////////////
        //Arrays java.utils.Arrays
        //与数组相关的方法
        /*
        public static String toString(数组);将参数数组转换为字符串按照默认格式[20,30,90]
        public static void sort(数组);对数组进行排序 小->大
        【1】数值，从小到大排序
        【2】字符串，按照字母升序
        【3】自定义类型，自定义类需要有Comparable或者Comparator接口的支持
         */
        int[] intArray = {4, 2, 8, 6};
        String int2str = Arrays.toString(intArray);
        System.out.println(int2str);

        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        String[] strArray = {"zscsdcsd", "bffvdf", "dscsdcsd", "scdcsddhuie"};

        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));
        //字符串中的字符升序排列
        String _str = "scsjkbcwivfiwuefbqe893rbcjkbcdsb";

        //先把String数据转换为char型数组
        char[] str2char = _str.toCharArray();
        System.out.println(str2char);
        Arrays.sort(str2char);
        //倒序遍历
        for (int i = str2char.length - 1; i >= 0; i--) {
            System.out.println(str2char[i]);
        }
        /////////////////////////////////////////////////////////////////////////////
        //数学运算相关类math
        //java.lang.Math
        /*
        public static double abs(double m);//绝对值
        public static double ceil(double m);//向上取整
        public static double floor(double m);//向下取整
        public static long round(double m);//四舍五入
         */
        System.out.println(Math.abs(-3.14));

        //向上取整
        System.out.println(Math.ceil(3.1));//4.0

        //向下取整
        System.out.println(Math.floor(31.9));//31.0
        System.out.println(Math.floor(31.0));//31.0
        //四舍五入
        System.out.println(Math.round(34.63));//long 35
        //常量PI
        System.out.println(Math.PI);
        int count = 0;
        for (int i = (int) Math.ceil(-10.8); i <= Math.floor(5.9); i++) {
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);

    }
}
