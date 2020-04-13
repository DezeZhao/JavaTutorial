package JavaBasic.test5.Demo02;

public class Demo02Interface {
    public static void main(String[] args) {
        //创建了实现类对象
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs();
        a.mehtodDefault();//调用了默认方法

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.mehtodDefault();//调用了修改之后的接口默认方法
    }
}
