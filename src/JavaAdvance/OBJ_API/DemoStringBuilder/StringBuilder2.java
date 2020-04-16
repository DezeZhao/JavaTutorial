package JavaAdvance.OBJ_API.DemoStringBuilder;
/*
    StringBuilder和String可以相互转换:
        String->StringBuilder:可以使用StringBuilder的构造方法
            StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
        StringBuilder->String:可以使用StringBuilder中的toString方法
            public String toString()：将当前StringBuilder对象转换为String对象。
 */

public class StringBuilder2 {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("str = " + str);
        //String --> Stringbuilder
        StringBuilder bu = new StringBuilder(str);
        bu.append("World");
        System.out.println("bu = " + bu);//HelloWorld

        //String Builder --> String
        String s = bu.toString();
        System.out.println("s = " + s);

    }
}
