package JavaBasic.test6.Demo03;

/*
如果一个是事物内部包含另一个事物，即一个类内部包含另一个类
身体和心脏  汽车和发动机

分类:
1. 成员内部类
2. 局部内部类

成员内部类：
内用外，随意访问；外用内，需要内部类对象。

如何使用成员内部类？有两种方式：
1. 间接方式：在外部类的方法当中，使用内部类；然后main只是调用外部类的方法。
2. 直接方式，公式：
类名称 对象名 = new 类名称();
外部类名.内部类名 对象名 = new 外部类名.new 内部类名()
 */
public class Demo03Main {
    public static void main(String[] args) {
        Body body = new Body();
        body.methodBody();//通过外部类方法方法调用成员内部类

        System.out.println("=====================");

        Body.Heart heart = new Body().new Heart();
        heart.beat();

        System.out.println("=====================");

        Outer.Inner obj = new Outer().new Inner();
        obj.methodInner();
    }

}
