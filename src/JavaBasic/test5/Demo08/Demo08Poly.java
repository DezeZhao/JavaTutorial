package JavaBasic.test5.Demo08;

/*
java 多态性——父类引用指向子类对象

父类名称 对象名 = new 子类名称();
接口名称 对象名 = new 实现类名称();

 */

public class Demo08Poly {
    public static void main(String[] args) {
        Fu fu = new Zi();//左父右子
        fu.method();//子类的方法 method
        fu.methodFu();//子类没有该方法，向上找父类
    }
}
