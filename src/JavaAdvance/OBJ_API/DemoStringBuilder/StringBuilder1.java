package JavaAdvance.OBJ_API.DemoStringBuilder;

/*
String 对象不可变 s只是对String对象的一个引用
String s = "ABCabc";
System.out.println("s = " + s);

s = "123456";
System.out.println("s = " + s);
打印结果为：

s = ABCabc
 s = 123456
首先创建一个String对象s，然后让s的值为“ABCabc”， 然后又让s的值为“123456”。
 从打印结果可以看出，s的值确实改变了。那么怎么还说String对象是不可变的呢？
 其实这里存在一个误区： s只是一个String对象的引用，并不是对象本身。对象在
 内存中是一块内存区，成员变量越多，这块内存区占的空间越大。引用只是一个4字
 节的数据，里面存放了它所指向的对象的地址，通过这个地址可以访问对象。

也就是说，s只是一个引用，它指向了一个具体的对象，当s=“123456”; 这句代码执
行过之后，又创建了一个新的对象“123456”， 而引用s重新指向了这个心的对象，
原来的对象“ABCabc”还在内存中存在，并没有改变。
 */

//StringBuilder是字符串缓冲区可以提高字符串操作的效率，(可以看成一个长度可以变化的字符串)
//底层也是数组，没有被final修饰  可以改变长度
/*
java.lang.StringBuilder类:字符串缓冲区,可以提高字符串的效率
    构造方法:
        StringBuilder() 构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。
        StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
 */

/*
    StringBuilder的常用方法:
        public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身。
 */
public class StringBuilder1 {
    public static void main(String[] args) {

        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1=" + bu1);
        StringBuilder bu2 = new StringBuilder("abs");
        System.out.println("bu2=" + bu2);

        //使用append向bu1中添加数据
        //append返回的是this,即stringbuilder自身，故不需要返回值
        bu1.append(1);
        bu1.append("acs");
        bu1.append(4.5);
        bu1.append("的");
        bu1.append(true);

        System.out.println(bu1);


    }
}
